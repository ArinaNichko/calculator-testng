package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SubLongTest extends BaseTest {

  @Test(dataProvider = "createDataForSubLong", dataProviderClass = DataUtil.class)
  public void subLong(long expected, long a, long b) {
    Assert.assertEquals(calculator.sub(a, b), expected);
  }
}

package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class MultLongTest extends BaseTest {

  @Test(dataProvider = "createDataForMultLong", dataProviderClass = DataUtil.class)
  public void multLong(long expected, long a, long b) {
    Assert.assertEquals(calculator.mult(a, b), expected);
  }
}

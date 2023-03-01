package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SubDoubleTest extends BaseTest {

  @Test(dataProvider = "createDataForSubDouble", dataProviderClass = DataUtil.class)
  public void sumDouble(double expected, double a, double b) {
    Assert.assertEquals(calculator.sub(a, b), expected, DELTA);
  }
}

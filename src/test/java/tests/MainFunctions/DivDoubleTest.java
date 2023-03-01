package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class DivDoubleTest extends BaseTest {

  @Test(dataProvider = "createDataForDivDouble", dataProviderClass = DataUtil.class)
  public void divDouble(double expected, double a, double b) {
    Assert.assertEquals(calculator.div(a, b), expected, DELTA);
  }

  @Test(dataProvider = "createDataForDivByZero", dataProviderClass = DataUtil.class)
  public void divDoubleByZero(double expected, double a, double b) {
    Assert.assertEquals(calculator.div(a, b), expected);
  }
}

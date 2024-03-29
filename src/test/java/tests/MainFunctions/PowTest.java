package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class PowTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void powerTest(double expected, double a, double b) {
    Assert.assertEquals(calculator.pow(a, b), expected, DELTA);
  }
}

package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class DivDoubleTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class, groups = {"division"})
  public void doubleNumbersDivisionTest(double expected, double a, double b) {
    Assert.assertEquals(calculator.div(a, b), expected, DELTA);
  }

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class, groups = {"divisionByZero"})
  public void  divisionByZeroTest(double expected, double a, double b) {
    Assert.assertEquals(calculator.div(a, b), expected);
  }
}

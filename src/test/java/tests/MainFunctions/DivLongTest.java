package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class DivLongTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void longNumbersDivisionTest(long expected, long a, long b) {
    Assert.assertEquals(calculator.div(a, b), expected);
  }

  @Test(expectedExceptions = NumberFormatException.class)
  public void divisionByZeroThrowsExceptionTest() {
    calculator.div(10, 0);
  }
}

package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class MultDoubleTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void doubleNumbersMultiplicationTest(double expected, double a, double b) {
    Assert.assertEquals(calculator.mult(a, b), expected, DELTA);
  }
}

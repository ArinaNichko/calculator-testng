package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SumDoubleTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void doubleNumbersSumTest(double expectedResult, double a, double b) {
    Assert.assertEquals(calculator.sum(a, b), expectedResult);
  }
}

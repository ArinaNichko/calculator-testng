package tests.TrigonometryFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SqrtTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void squareRootTest(double expected, double a) {
    Assert.assertEquals(calculator.sqrt(a), expected, DELTA);
  }
}

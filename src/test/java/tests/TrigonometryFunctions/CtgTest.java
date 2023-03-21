package tests.TrigonometryFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class CtgTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void cotangentTest(double expected, double a) {
    Assert.assertEquals(calculator.ctg(a), expected, DELTA);
  }
}

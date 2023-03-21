package tests.TrigonometryFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class CosTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void cosineTest(double expected, double a) {
    Assert.assertEquals(calculator.cos(a), expected, DELTA);
  }
}

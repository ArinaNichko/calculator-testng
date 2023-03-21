package tests.TrigonometryFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SinTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void sineTest(double expected, double a) {
    Assert.assertEquals(calculator.sin(a), expected, DELTA);
  }

  @Test
  public void sineWithInfinityTest() {
    Assert.assertTrue((Double.isNaN(calculator.sin(Double.POSITIVE_INFINITY))));
  }
}

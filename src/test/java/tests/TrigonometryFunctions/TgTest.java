package tests.TrigonometryFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class TgTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void tangentTest(double expected, double a) {
    Assert.assertEquals(calculator.tg(a), expected, DELTA);
  }
}

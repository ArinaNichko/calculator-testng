package tests.TrigonometricFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SinTest extends BaseTest {

  @Test(dataProvider = "createDataForSin", dataProviderClass = DataUtil.class)
  public void sin(double expected, double a) {
    Assert.assertEquals(calculator.sin(a), expected, DELTA);
  }

  @Test(dataProvider = "createDataForSinByInfinityAndNaN", dataProviderClass = DataUtil.class)
  public void sinByInfinityAndNaN(double a) {
    Assert.assertTrue((Double.isNaN(calculator.sin(a))));
  }
}

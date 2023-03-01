package tests.TrigonometricFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class CosTest extends BaseTest {

  @Test(dataProvider = "createDataForCos", dataProviderClass = DataUtil.class)
  public void cos(double expected, double a) {
    Assert.assertEquals(calculator.cos(a), expected, DELTA);
  }
}

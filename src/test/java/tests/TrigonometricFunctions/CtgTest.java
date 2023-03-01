package tests.TrigonometricFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class CtgTest extends BaseTest {

  @Test(dataProvider = "createDataForCtg", dataProviderClass = DataUtil.class)
  public void ctg(double expected, double a) {
    Assert.assertEquals(calculator.ctg(a), expected, DELTA);
  }
}

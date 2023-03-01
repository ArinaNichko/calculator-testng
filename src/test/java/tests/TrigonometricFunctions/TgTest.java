package tests.TrigonometricFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class TgTest extends BaseTest {

  @Test(dataProvider = "createDataForTg", dataProviderClass = DataUtil.class)
  public void tg(double expected, double a) {
    Assert.assertEquals(calculator.tg(a), expected, DELTA);
  }

}

package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SqrtTest extends BaseTest {

  @Test(dataProvider = "createDataForSqrt", dataProviderClass = DataUtil.class)
  public void sqrt(double expected, double a) {
    Assert.assertEquals(calculator.sqrt(a), expected, DELTA);
  }
}

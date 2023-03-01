package tests.AdditionalFunctions;

import configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataUtil;

public class IsPositiveTest extends BaseTest {

  @Test
  public void isPositive() {
    Assert.assertTrue(calculator.isPositive(10));
  }

  @Test(dataProvider = "createDataForPositive", dataProviderClass = DataUtil.class)
  public void isNotNegativeAndZero(long num) {
    Assert.assertFalse(calculator.isPositive(num));
  }
}

package tests.AdditionalFunctions;

import configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataUtil;

public class IsNegativeTest extends BaseTest {

  @Test
  public void isNegative() {
    Assert.assertTrue(calculator.isNegative(-10));
  }

  @Test(dataProvider = "createDataForNegative", dataProviderClass = DataUtil.class)
  public void isNotPositiveAndZero(long num) {
    Assert.assertFalse(calculator.isNegative(num));
  }
}

package tests.AdditionalFunctions;

import configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

  @Test
  public void isNegativeTest() {
    Assert.assertTrue(calculator.isNegative(-10));
  }

  @Test
  public void isNotNegativePositiveTest() {
    Assert.assertFalse(calculator.isNegative(0));
  }
}

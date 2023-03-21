package tests.AdditionalFunctions;

import configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

  @Test
  public void isPositiveTest() {
    Assert.assertTrue(calculator.isPositive(10));
  }

  @Test
  public void isNotPositiveTest() {
    Assert.assertFalse(calculator.isPositive(0));
  }
}

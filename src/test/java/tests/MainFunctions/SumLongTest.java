package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;

public class SumLongTest extends BaseTest {

  @Test
  public void sumInt1() {
    Assert.assertEquals(calculator.sum(100, 200), 300);
  }

  @Test
  public void sumInt2() {
    Assert.assertEquals(calculator.sum(-10, -20), -30);
  }

  @Test
  public void sumInt3() {
    Assert.assertEquals(calculator.sum(-10, 20), 10);
  }

  @Test
  public void sumInt4() {
    Assert.assertEquals(calculator.sum(5, -20), -15);
  }
}

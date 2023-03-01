package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;

public class SumDoubleTest extends BaseTest {

  @Test
  public void sumDouble1() {
    Assert.assertEquals(calculator.sum(2.5, 4), 6.5, DELTA);
  }

  @Test
  public void sumDouble2() {
    Assert.assertEquals(calculator.sum(-3.2, 10.4), 7.2, DELTA);
  }
}

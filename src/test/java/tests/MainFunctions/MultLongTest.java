package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class MultLongTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void longNumbersMultiplicationTest(long expected, long a, long b) {
    Assert.assertEquals(calculator.mult(a, b), expected);
  }
}

package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SubLongTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void longNumbersSubtractionTest(long expectedResult, long a, long b) {
    Assert.assertEquals(calculator.sub(a, b), expectedResult);
  }
}
package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class SumLongTest extends BaseTest {

  @Test(dataProvider = "CalculatorOperationData", dataProviderClass = DataUtil.class)
  public void longNumbersSumTest(long expectedResult, long a, long b) {
    Assert.assertEquals(calculator.sum(a, b), expectedResult);
  }


}

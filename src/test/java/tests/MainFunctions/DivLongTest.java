package tests.MainFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.BaseTest;
import utils.DataUtil;

public class DivLongTest extends BaseTest {

  @Test(dataProvider = "createDataForDivLong", dataProviderClass = DataUtil.class)
  public void divLong(long expected, long a, long b) {
    Assert.assertEquals(calculator.div(a, b), expected);
  }

  @Test(expectedExceptions = NumberFormatException.class)
  public void divLongByZero() {
    calculator.div(10, 0);
  }
}

package tests.AdditionalFunctions;

import org.example.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleepTest {

  @Test
  public void sleep() {
    long startTime = System.currentTimeMillis();
    Timeout.sleep(1);
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    Assert.assertTrue(duration >= 1000, "Sleep duration was less than expected.");
  }

  @Test
  public void sleepWithZero() {
    long startTime = System.currentTimeMillis();
    Timeout.sleep(0);
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    Assert.assertTrue(duration < 1000, "Sleep duration was more than expected.");
  }
}
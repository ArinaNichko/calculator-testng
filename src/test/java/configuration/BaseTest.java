package configuration;

import org.example.Calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
  final protected static double DELTA = 0.01d;
  protected static Calculator calculator;

  @BeforeClass
  public static void beforeClassConfiguration() {
    calculator = new Calculator();
  }

  @AfterClass
  public static void afterTestConfiguration() {
  }
}

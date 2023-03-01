package utils;

import org.testng.annotations.DataProvider;

public class DataUtil {
  @DataProvider(name = "createDataForSubLong")
  public static Object[][] createDataForSubLong() {
    return new Object[][]{
            new Object[]{6, 8, 2},
            new Object[]{10, 10, 0},
            new Object[]{-8, -10, -2},
            new Object[]{5, 0, -5},
            new Object[]{-5, 7, 12}
    };
  }

  @DataProvider(name = "createDataForSubDouble")
  public static Object[][] createDataForSubDouble() {
    return new Object[][]{
            new Object[]{0.11, 0.22, 0.11},
            new Object[]{1.99, 1.00, -0.99},
            new Object[]{-2, -5.0, -3.0},
            new Object[]{-16, -7.0, 9.0}
    };
  }

  @DataProvider(name = "createDataForMultDouble")
  public static Object[][] createDataForMultDouble() {
    return new Object[][]{
            new Object[]{62.0, 5, 12.5},
            new Object[]{6.0, -1.0, -6.0},
            new Object[]{0.0, 0.0, -2.0}
    };
  }

  @DataProvider(name = "createDataForMultLong")
  public static Object[][] createDataForMultLong() {
    return new Object[][]{
            new Object[]{0, 5, 0},
            new Object[]{-56, -8, 7},
            new Object[]{390, -5, -78}
    };
  }

  @DataProvider(name = "createDataForDivLong")
  public static Object[][] createDataForDivLong() {
    return new Object[][]{
            new Object[]{0, 5, 10},
            new Object[]{4, -8, -2},
            new Object[]{-20, -100, 5},
            new Object[]{0, 0, 5}

    };
  }

  @DataProvider(name = "createDataForDivDouble")
  public static Object[][] createDataForDivDouble() {
    return new Object[][]{
            new Object[]{5.0, 2.5, 0.5},
            new Object[]{4.0, -8.0, -2.0},
            new Object[]{-20, -100.0, 5.0}
    };
  }

  @DataProvider(name = "createDataForDivByZero")
  public static Object[][] createDataForDivByZero() {
    return new Object[][]{
            new Object[]{Double.POSITIVE_INFINITY, 1.0, 0},
            new Object[]{Double.NEGATIVE_INFINITY, -5.0, 0}
    };
  }

  @DataProvider(name = "createDataForPow")
  public static Object[][] createDataForPow() {
    return new Object[][]{
            new Object[]{25.0, 5.0, 2.0},
            new Object[]{625.0, -5.0, 4.5},
            new Object[]{0.027, 6.0, -2},
            new Object[]{1.0, 7, 0}
    };
  }

  @DataProvider(name = "createDataForSqrt")
  public static Object[][] createDataForSqrt() {
    return new Object[][]{
            new Object[]{0, 0},
            new Object[]{2.23, -5.0},
            new Object[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
            new Object[]{4, 16}
    };
  }

  @DataProvider(name = "createDataForTg")
  public static Object[][] createDataForTg() {
    return new Object[][]{
            new Object[]{0.32, 60},
            new Object[]{-0.32, -60}
    };
  }

  @DataProvider(name = "createDataForCtg")
  public static Object[][] createDataForCtg() {
    return new Object[][]{
            new Object[]{0.64, 1},
            new Object[]{0.61, 45}
    };
  }

  @DataProvider(name = "createDataForSin")
  public static Object[][] createDataForSin() {
    return new Object[][]{
            new Object[]{0, 0},
            new Object[]{-0.30, 60},
            new Object[]{0.89, 90},
            new Object[]{0.30, -60}
    };
  }

  @DataProvider(name = "createDataForSinByInfinityAndNaN")
  public static Object[][] createDataForSinByInfinityAndNaN() {
    return new Object[][]{
            new Object[]{Double.POSITIVE_INFINITY},
            new Object[]{Double.NEGATIVE_INFINITY},
            new Object[]{Double.NaN}
    };
  }

  @DataProvider(name = "createDataForCos")
  public static Object[][] createDataForCos() {
    return new Object[][]{
            new Object[]{0, 1},
            new Object[]{-0.44, 90},
            new Object[]{-0.95, 60},
            new Object[]{-0.95, -60},
            new Object[]{0.88, 145}
    };
  }

  @DataProvider(name = "createDataForPositive")
  public static Object[][] createDataForPositive() {
    return new Object[][]{
            new Object[]{-56},
            new Object[]{0}
    };
  }

  @DataProvider(name = "createDataForNegative")
  public static Object[][] createDataForNegative() {
    return new Object[][]{
            new Object[]{15},
            new Object[]{0}
    };
  }
}

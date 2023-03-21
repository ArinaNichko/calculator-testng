package utils;

import model.MainFunction;
import model.TrigonometryFunction;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.List;

import static utils.CsvHelper.readCsvFileAsObject;

public class DataUtil {

  @DataProvider(name = "CalculatorOperationData")
  public static Object[][] createCalculatorOperationData(ITestContext context) {
    String filepath = context.getCurrentXmlTest().getParameter("filepath");
    boolean isMainFunction = Boolean.parseBoolean(context.getCurrentXmlTest().getParameter("isMainFunction"));
    List<?> dataList;
    if (isMainFunction) {
      dataList = readCsvFileAsObject(new File(filepath), MainFunction.class);
    } else {
      dataList = readCsvFileAsObject(new File(filepath), TrigonometryFunction.class);
    }

    Object[][] data = new Object[dataList.size()][];
    for (int i = 0; i < dataList.size(); i++) {
      Object item = dataList.get(i);
      if (item instanceof MainFunction rowData) {
        data[i] = new Object[]{rowData.getExpectedResult(), rowData.getA(), rowData.getB()};
      } else if (item instanceof TrigonometryFunction rowData) {
        data[i] = new Object[]{rowData.getExpectedResult(), rowData.getA()};
      }
    }
    return data;
  }
}

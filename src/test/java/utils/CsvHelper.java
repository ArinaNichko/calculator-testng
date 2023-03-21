package utils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import exceptions.TestExecutionException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvHelper {
  static CsvMapper csvMapper = new CsvMapper();

  public static <T> List<T> readCsvFileAsObject(File file, Class<T> classToCast) {
    CsvSchema classSchema = csvMapper.schemaFor(classToCast).withHeader();
    try {
      MappingIterator<T> it = csvMapper
              .readerFor(classToCast)
              .with(classSchema)
              .readValues(file);
      return it.readAll();
    } catch (IOException e) {
      throw new TestExecutionException(e.getMessage());
    }
  }
}

package model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonPropertyOrder({"expectedResult", "a", "b"})
public class MainFunction {
  private Number expectedResult;
  private Number a;
  private Number b;
}

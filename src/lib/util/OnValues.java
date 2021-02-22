package lib.util;

import static lib.util.Methods.*;

public class OnValues {
  private String value;
  private Boolean isNumber = false;

  public OnValues(String value) {
    this.value = value;
    this.isNumber = isNumber(this.value);
  }

  public String getValue() {
    return this.value;
  }

  public Double getValueDouble() {
    return parseDouble(this.value);
  }

  public Integer getValueInteger() {
    return parseInteger(this.value);
  }

  public void set(String newValue) {
    this.value = newValue;
    this.isNumber = isNumber(newValue);
  }

  public Boolean getIsNumber() {
    return this.isNumber;
  }
}

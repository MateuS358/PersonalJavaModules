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

  public Number getValueNumber() {
    return parseNumber(this.value);
  }

  public void set(String newValue) {
    this.value = newValue;
    this.isNumber = isNumber(newValue);
  }

  public Boolean getIsNumber() {
    return this.isNumber;
  }
}

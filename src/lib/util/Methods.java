package lib.util;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Methods {
  public static void write(String text, Object... comp) {
    for(var c = 0; c < comp.length; c++) {
      text = text.replaceAll("%"+c+"%", comp[c].toString());
    }
    System.out.print(colors(text));
  }

  public static void writeln(String text, Object... comp) {
    write(text+"\n", comp);
  }

  public static void readf(OnValues value, String text, Object... comp) {
    Scanner input = new Scanner(System.in);
    while(value.getIsNumber()) {
      write(text, comp);
      value.set(input.nextLine());
      if(!isNumber(value.getValue())) {
        writeln("%RED%Error: INVALID NUMBER!");
        continue;
      }
      break;
    }
    if(!value.getIsNumber()) {
      write(text, comp);
      value.set(input.nextLine());
    }
  }

  public static Boolean isNumber(String value) {
    if (Double.parseDouble(parseNumber(value).toString()) != -1d) {
      return true;
    }
    return false;
  }

  public static Number parseNumber(String value) {
    if(Integer.parseInt(value) != -1) {
      return Integer.parseInt(value);
    } if(Double.parseDouble(value) != -1d) {
      return Double.parseDouble(value);
    } else {
      return -1;
    }
  }

  public static OnValues nOnValues(String value) {
    return new OnValues(value);
  }

  public static OnValues[] nOnValues(String... values) {
    OnValues[] nValue = new OnValues[values.length];
    for(var c = 0; c < values.length; c++) {
      nValue[c] = new OnValues(values[c]);
    }
    return nValue;
  }

  public static Double pow(Double toPow, Double ex) {
    return Math.pow(toPow, ex);
  }

  public static String round(Double value) {
    DecimalFormat formatter = new DecimalFormat("0");
    return formatter.format(value);
  }

  public static OnValues nOnValues() {
    return new OnValues("");
  }

  public static OnValues nOnValues(Double value) {
    return new OnValues(value.toString());
  }

  public static String colors(String text) {
    return text.replaceAll("%BLUE%", "\u001B[34m").
        replaceAll("%CYAN%", "\u001B[36m").
        replaceAll("%RED%", "\u001B[31m").
        replaceAll("%DEFAULT%", "\u001B[0m").
        replaceAll("%GREEN%", "\u001B[32m");
  }
}

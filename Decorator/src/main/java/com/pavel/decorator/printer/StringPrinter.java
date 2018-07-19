package com.pavel.decorator.printer;

public class StringPrinter implements Printer {

  public void print(String message) {
    System.out.println(message);
  }
}

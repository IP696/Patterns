package com.pavel.decorator.printer.decorators;

import com.pavel.decorator.printer.Printer;

public class InversePrinter implements Printer {

  private Printer printer;

  public InversePrinter(Printer printer) {
    this.printer = printer;
  }

  public void print(String message) {
    StringBuilder builder = new StringBuilder(message);
    printer.print(builder.reverse().toString());
  }
}

package com.pavel.decorator.printer.decorators;

import com.pavel.decorator.printer.Printer;

public class UpCasePrinter implements Printer {

  private Printer printer;

  public UpCasePrinter(Printer printer) {
    this.printer = printer;
  }

  public void print(String message) {
    printer.print(message.toUpperCase());
  }
}

package com.pavel.decorator;

import com.pavel.decorator.printer.decorators.InversePrinter;
import com.pavel.decorator.printer.decorators.UpCasePrinter;
import com.pavel.decorator.printer.Printer;
import com.pavel.decorator.printer.StringPrinter;
import com.pavel.decorator.reader.Converter;
import com.pavel.decorator.reader.StringConverter;
import com.pavel.decorator.reader.decorators.ReverseConverter;
import com.pavel.decorator.reader.decorators.UpCaseConverter;

public class Main {
  public static void main(String[] args) {

    System.out.println("Start...");

    Printer printer = new InversePrinter(new UpCasePrinter(new StringPrinter()));
    printer.print("pavel");

    Printer printer2 = new InversePrinter(new StringPrinter());
    printer2.print("pavel");

    Printer printer3 = new UpCasePrinter(new StringPrinter());
    printer3.print("pavel");

    Converter converter = new UpCaseConverter(new ReverseConverter(new StringConverter()));
    String pavel = converter.convert("Pavel");
    System.out.println(pavel);
  }
}

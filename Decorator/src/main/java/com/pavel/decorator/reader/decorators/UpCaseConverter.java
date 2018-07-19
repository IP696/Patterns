package com.pavel.decorator.reader.decorators;

import com.pavel.decorator.reader.Converter;

public class UpCaseConverter implements Converter {

  private Converter converter;

  public UpCaseConverter(Converter converter) {
    this.converter = converter;
  }

  public String convert(String message) {
    return converter.convert(message.toUpperCase());
  }
}

package com.pavel.decorator.reader.decorators;

import com.pavel.decorator.reader.Converter;

public class ReverseConverter implements Converter {

  private Converter converter;

  public ReverseConverter(Converter converter) {
    this.converter = converter;
  }

  public String convert(String message) {
    StringBuilder builder = new StringBuilder(message);
    return converter.convert(builder.reverse().toString());
  }
}

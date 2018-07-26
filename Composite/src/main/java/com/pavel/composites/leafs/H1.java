package com.pavel.composites.leafs;

import com.pavel.composites.Tag;

public class H1 extends Tag {

  private final String text;

  public H1(String text) {
    this.text = text;
  }

  public void draw() {
    System.out.println(text.toUpperCase());
  }

}

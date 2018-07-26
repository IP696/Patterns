package com.pavel.composites.leafs;

import com.pavel.composites.Tag;

public class Text extends Tag {

  private final String text;

  public Text(String text) {
    this.text = text;
  }

  public void draw() {
    System.out.println(text);
  }

}

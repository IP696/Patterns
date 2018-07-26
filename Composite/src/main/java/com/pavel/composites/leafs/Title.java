package com.pavel.composites.leafs;

import com.pavel.composites.Tag;

public class Title extends Tag {

  private final String text;

  public Title(String text) {
    this.text = text;
  }

  public void draw() {
    System.out.println("*********************** " + text + " *******************************");
  }

}

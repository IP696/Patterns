package com.pavel.composites;

//Component
public class Tag implements Component {

  public void draw() {
    throw new RuntimeException("");
  }

  public void add(Component graphic) {
    throw new RuntimeException("");
  }

  public void remove(Component graphic) {
    throw new RuntimeException("");
  }

  public Component getChild(int childId) {
    throw new RuntimeException("");
  }
}

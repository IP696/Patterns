package com.pavel.composites;

public interface Component {
  void draw();
  void add(Component graphic);
  void remove(Component graphic);
  Component getChild(int childId);
}

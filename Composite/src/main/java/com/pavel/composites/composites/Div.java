package com.pavel.composites.composites;

import com.pavel.composites.Tag;
import com.pavel.composites.Component;

import java.util.ArrayList;
import java.util.List;

public class Div extends Tag {

  private List<Component> graphics = new ArrayList<Component>();

  public void draw() {
    for (Component graphic : graphics) {
      graphic.draw();
    }
  }

  @Override
  public void add(Component graphic) {
    graphics.add(graphic);
  }

  @Override
  public void remove(Component graphic) {
    graphics.remove(graphic);
  }

  @Override
  public Component getChild(int childId) {
    if (graphics.get(childId) != null)
      return graphics.get(childId);
    return super.getChild(childId);
  }
}

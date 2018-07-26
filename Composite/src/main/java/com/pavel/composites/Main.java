package com.pavel.composites;

import com.pavel.composites.composites.Div;
import com.pavel.composites.leafs.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    Component page = new Div();

    Component header = new Div();
    header.add(new H1("Main information!"));
    header.add(new Line());

    Component body = new Div();
    body.add(new Text("The best site in internet!"));
    body.add(new H1("Menu"));
    body.add(getMenu());
    body.add(new Rectangle());

    Component footer = new Div();
    footer.add(new Line());
    footer.add(new H1("See a latter!"));

    page.add(new Title("Title"));
    page.add(header);

    page.add(body);
    page.add(footer);

    page.getChild(1).add(new Line());

    page.draw();
  }

  private static Div getMenu() {
    Div list = new Div();
    for (int i = 0; i<10; i++) {
      Div item = new Div();
      item.add(new Line());
      item.add(new Text("Item"+i));
      list.add(item);
    }
    return list;
  }
}

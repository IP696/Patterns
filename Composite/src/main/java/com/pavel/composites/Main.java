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
}

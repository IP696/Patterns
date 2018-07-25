package com.pavel.iterator.zoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HerbivoresZoo implements Zoo<AnimalItem> {

  private List<AnimalItem> herbivoresItems;

  public HerbivoresZoo() {
    this.herbivoresItems = new ArrayList<AnimalItem>();
    add(new AnimalItem("1", "Cow"));
    add(new AnimalItem("2", "Ram"));
    add(new AnimalItem("3", "Elk"));
  }

  private void add(AnimalItem herbivoresItem) {
    herbivoresItems.add(herbivoresItem);
  }

  public Iterator<AnimalItem> createIterator() {
    return new HerbivoresIterator();
  }

  private class HerbivoresIterator implements Iterator<AnimalItem> {

    private int position = 0;

    public boolean hasNext() {
      return position < herbivoresItems.size() && herbivoresItems.get(position) != null;
    }

    public AnimalItem next() {
      return herbivoresItems.get(position++);
    }

    public void remove() {
      System.out.println("not implemented yet!");
    }
  }

}

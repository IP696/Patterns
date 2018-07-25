package com.pavel.iterator.zoo;

import java.util.Iterator;

public class MammalsZoo implements Zoo<AnimalItem> {
  private static final int MAX_ITEMS = 3;
  private AnimalItem[] animalItems;
  private int numberOfItems = 0;

  public MammalsZoo() {
    this.animalItems = new AnimalItem[MAX_ITEMS];
    add(new AnimalItem("8", "Tiger"));
    add(new AnimalItem("9", "Lion"));
    add(new AnimalItem("10", "Fox"));
  }

  private void add(AnimalItem animalItem) {
    animalItems[numberOfItems++] = animalItem;
  }

  public Iterator<AnimalItem> createIterator() {
    return new MammalsIterator();
  }

  private class MammalsIterator implements Iterator<AnimalItem> {

    private int position = 0;

    public boolean hasNext() {
      return position < animalItems.length && animalItems[position] != null;
    }

    public AnimalItem next() {
      return animalItems[position++];
    }

    public void remove() {
      System.out.println("not implemented yet!");
    }
  }

}

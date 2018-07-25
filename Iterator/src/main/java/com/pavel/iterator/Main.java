package com.pavel.iterator;

import com.pavel.iterator.zoo.AnimalItem;
import com.pavel.iterator.zoo.HerbivoresZoo;
import com.pavel.iterator.zoo.MammalsZoo;
import com.pavel.iterator.zoo.Zoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    List<Zoo<AnimalItem>> zoos = new ArrayList<Zoo<AnimalItem>>();

    Zoo<AnimalItem> herbivoresZoo = new HerbivoresZoo();
    Zoo<AnimalItem> mammalsZoo = new MammalsZoo();

    zoos.add(herbivoresZoo);
    zoos.add(mammalsZoo);

    for (Zoo<AnimalItem> zoo : zoos) {
      Iterator<AnimalItem> iterator = zoo.createIterator();
      while (iterator.hasNext()) {
        AnimalItem animalItem = iterator.next();
        System.out.println(animalItem.getId() + " " + animalItem.getName());
      }
    }

  }
}

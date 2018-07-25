package com.pavel.iterator;

import com.pavel.iterator.zoo.AnimalItem;
import com.pavel.iterator.zoo.HerbivoresZoo;
import com.pavel.iterator.zoo.MammalsZoo;
import com.pavel.iterator.zoo.Zoo;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    Zoo<AnimalItem> herbivoresZoo = new HerbivoresZoo();

    Iterator<AnimalItem> herbivoresIterator = herbivoresZoo.createIterator();

    while (herbivoresIterator.hasNext()) {
      AnimalItem herbivoresItem = herbivoresIterator.next();
      System.out.println(herbivoresItem.getId() + " " + herbivoresItem.getName());
    }

    MammalsZoo mammalsZoo = new MammalsZoo();
    Iterator<AnimalItem> mammalsIterator = mammalsZoo.createIterator();

    while (mammalsIterator.hasNext()) {
      AnimalItem herbivoresItem = mammalsIterator.next();
      System.out.println(herbivoresItem.getId() + " " + herbivoresItem.getName());
    }

  }
}

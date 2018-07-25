package com.pavel.iterator.zoo;

public class AnimalItem {

  private String id;
  private String Name;

  public AnimalItem(String id, String name) {
    this.id = id;
    Name = name;
  }

  public AnimalItem() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }
}

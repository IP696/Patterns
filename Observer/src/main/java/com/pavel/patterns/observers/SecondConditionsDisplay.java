package com.pavel.patterns.observers;

import com.pavel.patterns.subjects.Subject;

public class SecondConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;

  public SecondConditionsDisplay(Subject weatherData) {
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("SecondConditionsDisplay temperature: " + temperature + " humidity: " + humidity);
  }
}

package com.pavel.patterns.subjects;

import com.pavel.patterns.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private List<Observer> observers;

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0)
      observers.remove(i);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }

  }

  public void measurementsChanged() {
     notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}

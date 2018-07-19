package com.pavel.patterns;

import com.pavel.patterns.observers.CurrentConditionsDisplay;
import com.pavel.patterns.observers.SecondConditionsDisplay;
import com.pavel.patterns.subjects.WeatherData;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    SecondConditionsDisplay secondConditionsDisplay = new SecondConditionsDisplay(weatherData);
    weatherData.setMeasurements(1.2f,2.1f,3.1f);
  }
}

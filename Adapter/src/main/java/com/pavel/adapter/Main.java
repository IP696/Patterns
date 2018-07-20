package com.pavel.adapter;

import com.pavel.adapter.adapters.MeteoDataAdapter;
import com.pavel.adapter.client.MeteorStation;
import com.pavel.adapter.client.MeteorStationImpl;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");
    MeteorStation meteorStation = new MeteorStationImpl();
    MeteoDataAdapter meteoDataAdapter = new MeteoDataAdapter(meteorStation);
    String formattedWeatherData = meteoDataAdapter.formattedWeatherData();
    System.out.println(formattedWeatherData);
  }
}

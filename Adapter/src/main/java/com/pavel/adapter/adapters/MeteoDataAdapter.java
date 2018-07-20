package com.pavel.adapter.adapters;

import com.pavel.adapter.MeteoData;
import com.pavel.adapter.client.MeteorStation;

public class MeteoDataAdapter implements MeteoData {

  private final MeteorStation meteorStation;

  public MeteoDataAdapter(MeteorStation meteorStation) {
    this.meteorStation = meteorStation;
  }

  public String formattedWeatherData() {
    return "Today we have temperature: " + meteorStation.temperature() + " humidity: " + meteorStation.humidity()
      + " pressure: " + meteorStation.pressure();
  }
}

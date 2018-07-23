package com.pavel.adapter.adapters;

import com.pavel.adapter.Player;
import com.pavel.adapter.players.SensorPlayer;

public class SensorPlayerAdapter implements Player {

  private final SensorPlayer sensorPlayer;

  public SensorPlayerAdapter(SensorPlayer sensorPlayer) {
    this.sensorPlayer = sensorPlayer;
  }

  public void play() {
    sensorPlayer.pressPlay();
  }

  public void stop() {
    sensorPlayer.pressStop();
  }
}

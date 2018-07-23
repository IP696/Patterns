package com.pavel.adapter.adapters;

import com.pavel.adapter.Player;
import com.pavel.adapter.players.RotaryTumblerPlayer;

public class RotaryTumblerPlayerAdapter implements Player {

  private final RotaryTumblerPlayer rotaryTumblerPlayer;

  public RotaryTumblerPlayerAdapter(RotaryTumblerPlayer rotaryTumblerPlayer) {
    this.rotaryTumblerPlayer = rotaryTumblerPlayer;
  }

  public void play() {
    rotaryTumblerPlayer.switchToLeft();
  }

  public void stop() {
    rotaryTumblerPlayer.switchToRight();
  }
}

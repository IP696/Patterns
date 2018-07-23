package com.pavel.adapter.adapters;

import com.pavel.adapter.Player;
import com.pavel.adapter.players.TumblerPlayer;

public class TumblerPlayerAdapter implements Player {

  private final TumblerPlayer tumblerPlayer;

  public TumblerPlayerAdapter(TumblerPlayer tumblerPlayer) {
    this.tumblerPlayer = tumblerPlayer;
  }

  public void play() {
    tumblerPlayer.switchToUp();
  }

  public void stop() {
    tumblerPlayer.switchToDown();
  }
}

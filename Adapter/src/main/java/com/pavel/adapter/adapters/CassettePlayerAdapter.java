package com.pavel.adapter.adapters;

import com.pavel.adapter.Player;
import com.pavel.adapter.players.CassettePlayer;

public class CassettePlayerAdapter implements Player {

  private final CassettePlayer cassettePlayer;

  public CassettePlayerAdapter(CassettePlayer cassettePlayer) {
    this.cassettePlayer = cassettePlayer;
  }

  public void play() {
    cassettePlayer.pressPlay();
  }

  public void stop() {
    cassettePlayer.pressStop();
  }
}

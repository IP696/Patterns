package com.pavel.adapter;

public class AudioSystem {

  private Player player;



  public void play(){
    player.play();
  }

  public void stop(){
    player.stop();
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}

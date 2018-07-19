package com.pavel.command.commands;

import com.pavel.command.receivers.SpaceTransmitter;

public class MessageFromFeatureCommand implements Command{

  private final SpaceTransmitter transmitter;

  public MessageFromFeatureCommand(SpaceTransmitter transmitter) {
    this.transmitter = transmitter;
  }

  public void execute() {
    transmitter.connect();
    transmitter.sendMessage("Hi! I am T1000");
    setDelay(1000L);
    transmitter.sendMessage("I am from feature");
    setDelay(1000L);
    transmitter.sendMessage("I will be back");
    transmitter.disconnect();
  }

  private void setDelay(long delay){
    try {
      Thread.sleep(delay);
    } catch (InterruptedException e) {
      System.out.println("connection error: "+ e.getMessage());
    }
  }
}

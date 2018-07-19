package com.pavel.command.commands;

import com.pavel.command.receivers.SpaceTransmitter;

public class SayHelloCommand implements Command{

  private final SpaceTransmitter transmitter;

  public SayHelloCommand(SpaceTransmitter transmitter) {
    this.transmitter = transmitter;
  }

  public void execute() {
    transmitter.connect();
    transmitter.sendMessage("Hello Ilon Mask!");
    transmitter.disconnect();
  }
}

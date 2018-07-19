package com.pavel.command.commands;

import com.pavel.command.receivers.SpaceTransmitter;

public class SendSecretMessageCommand implements Command{

  private final SpaceTransmitter transmitter;

  public SendSecretMessageCommand(SpaceTransmitter transmitter) {
    this.transmitter = transmitter;
  }

  public void execute() {
    transmitter.connect();
    transmitter.sendMessage("Secret message");
    transmitter.disconnect();
  }
}

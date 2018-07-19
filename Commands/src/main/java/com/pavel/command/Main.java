package com.pavel.command;

import com.pavel.command.commands.MessageFromFeatureCommand;
import com.pavel.command.commands.SayHelloCommand;
import com.pavel.command.commands.SendSecretMessageCommand;
import com.pavel.command.receivers.SpaceTransmitter;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    CommandExecutor commandExecutor = new CommandExecutor();
    SpaceTransmitter spaceTransmitter = new SpaceTransmitter();

    commandExecutor.addCommand(new SayHelloCommand(spaceTransmitter));
    commandExecutor.addCommand(new SendSecretMessageCommand(spaceTransmitter));
    commandExecutor.addCommand(new MessageFromFeatureCommand(spaceTransmitter));

    commandExecutor.executeCommands();
  }
}

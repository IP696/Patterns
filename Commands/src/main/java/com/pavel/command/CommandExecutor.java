package com.pavel.command;

import com.pavel.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {

  private List<Command> commands;

  public CommandExecutor() {
    commands = new ArrayList<Command>();
  }

  public void addCommand(Command command) {
    commands.add(command);
  }

  public void executeCommands() {
    for (Command command : commands) {
      command.execute();
    }
    commands.clear();
  }
}

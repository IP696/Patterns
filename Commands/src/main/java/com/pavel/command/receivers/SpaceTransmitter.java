package com.pavel.command.receivers;

public class SpaceTransmitter {

  public void connect() {
    System.out.println("Start connect to Space...");
    try {
      Thread.sleep(3000L);
    } catch (InterruptedException e) {
      System.out.println("connection error: " + e.getMessage());
    }
    System.out.println("connection successful");
  }


  public void sendMessage(String message){
    System.out.println("send message ===> "+ message);
    try {
      Thread.sleep(3000L);
    } catch (InterruptedException e) {
      System.out.println("sending error: " + e.getMessage());
    }
    System.out.println("message was sent to space");
  }

  public void disconnect() {
    System.out.println("connection closed");
  }
}

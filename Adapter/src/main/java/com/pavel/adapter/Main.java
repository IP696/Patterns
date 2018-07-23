package com.pavel.adapter;

import com.pavel.adapter.adapters.CassettePlayerAdapter;
import com.pavel.adapter.adapters.RotaryTumblerPlayerAdapter;
import com.pavel.adapter.adapters.SensorPlayerAdapter;
import com.pavel.adapter.adapters.TumblerPlayerAdapter;
import com.pavel.adapter.players.CassettePlayer;
import com.pavel.adapter.players.RotaryTumblerPlayer;
import com.pavel.adapter.players.SensorPlayer;
import com.pavel.adapter.players.TumblerPlayer;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start...");

    Player cassettePlayerAdapter = new CassettePlayerAdapter(new CassettePlayer());
    Player sensorPlayerAdapter = new SensorPlayerAdapter(new SensorPlayer());
    Player tumblerPlayerAdapter = new TumblerPlayerAdapter(new TumblerPlayer());
    Player rotaryTumblerPlayerAdapter = new RotaryTumblerPlayerAdapter(new RotaryTumblerPlayer());

    System.out.println("------------------------------cassettePlayerAdapter--------------------------------");
    AudioSystem audioSystem = new AudioSystem();
    audioSystem.setPlayer(cassettePlayerAdapter);
    audioSystem.play();
    audioSystem.stop();

    System.out.println("------------------------------sensorPlayerAdapter--------------------------------");

    audioSystem.setPlayer(sensorPlayerAdapter);
    audioSystem.play();
    audioSystem.stop();

    System.out.println("------------------------------tumblerPlayerAdapter--------------------------------");

    audioSystem.setPlayer(tumblerPlayerAdapter);
    audioSystem.play();
    audioSystem.stop();

    System.out.println("------------------------------rotaryTumblerPlayerAdapter--------------------------------");

    audioSystem.setPlayer(rotaryTumblerPlayerAdapter);
    audioSystem.play();
    audioSystem.stop();

  }
}

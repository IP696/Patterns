package com.pavel.patterns.subjects;

import com.pavel.patterns.observers.Observer;

public interface Subject {
  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();
}

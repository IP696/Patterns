package com.pavel.iterator.zoo;

import java.util.Iterator;

public interface Zoo<T> {
  Iterator<T> createIterator();
}

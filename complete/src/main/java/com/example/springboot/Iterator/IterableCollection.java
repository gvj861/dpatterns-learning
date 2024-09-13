package com.example.springboot.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
package com.example.springboot.Iterator;

public interface Iterator<T> {
    boolean hasNext();  // Check if there are more rows to fetch
    T next();           // Fetch the next row
}
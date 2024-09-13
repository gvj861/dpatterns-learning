package com.example.springboot.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> implements IterableCollection<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(items);
    }
}


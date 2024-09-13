package com.example.springboot.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int index = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        }
        throw new NoSuchElementException();
    }
}


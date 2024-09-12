package com.example.springboot.NullObject;

public class Car extends Vehicle {
    @Override
    public int getTankCapacity() {
        return 45;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
}

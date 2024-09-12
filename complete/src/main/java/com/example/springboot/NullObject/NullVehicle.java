package com.example.springboot.NullObject;

public class NullVehicle extends Vehicle {

    /**
     * @return int
     */
    @Override
    public int getTankCapacity() {
        return 0;
    }

    /**
     * @return int
     */
    @Override
    public int getSeatCapacity() {
        return 0;
    }
}

package com.example.springboot.NullObject;


public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        }  else {
            return new NullVehicle(); // // Null object Design pattern
        }
    }
}

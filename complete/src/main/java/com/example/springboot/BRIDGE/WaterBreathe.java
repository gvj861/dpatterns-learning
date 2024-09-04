package com.example.springboot.BRIDGE;

public class WaterBreathe implements BreatheImplementor{
    /**
     *
     */
    @Override
    public void breathe() {
        System.out.println("Water breathe");
    }
}

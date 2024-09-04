package com.example.springboot.BRIDGE;

public class LandBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Land breathe");
    }
}

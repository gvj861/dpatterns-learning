package com.example.springboot.BRIDGE;

public abstract class LivingThings {
    protected BreatheImplementor implementor;

    public LivingThings(BreatheImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void breatheProcess();
}

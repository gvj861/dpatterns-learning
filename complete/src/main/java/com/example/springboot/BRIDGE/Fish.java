package com.example.springboot.BRIDGE;

public class Fish extends LivingThings{
    /**
     * @param implementor
     */
    public Fish(BreatheImplementor implementor) {
        super(implementor);
    }

    /**
     *
     */
    @Override
    public void breatheProcess() {
        this.implementor.breathe();
    }
}

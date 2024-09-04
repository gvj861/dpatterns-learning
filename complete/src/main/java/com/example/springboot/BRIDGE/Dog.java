package com.example.springboot.BRIDGE;

public class Dog extends LivingThings {
    /**
     * @param implementor
     */
    public Dog(BreatheImplementor implementor) {
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

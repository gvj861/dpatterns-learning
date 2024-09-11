package com.example.springboot.Decorator;

public class Jalapeno extends Toppings {
    /**
     * @param pizza
     */
    public Jalapeno(BasePizza pizza) {
        super(pizza);
    }

    public int cost() {
        return this.pizza.cost() + 20;
    }
}

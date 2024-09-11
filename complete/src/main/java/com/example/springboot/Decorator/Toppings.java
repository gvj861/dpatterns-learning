package com.example.springboot.Decorator;

public abstract class Toppings implements BasePizza {

    BasePizza pizza;

    public Toppings(BasePizza pizza) {
        this.pizza = pizza;
    }

    public abstract int cost();

}

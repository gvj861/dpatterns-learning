package com.example.springboot.Decorator;

public class ExtraCheese extends Toppings {

    /**
     * @param pizza
     */
    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }
    /**
     * @return
     */
    public int cost() {
        return this.pizza.cost() + 10;
    }
}

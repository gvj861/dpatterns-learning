package com.example.springboot.product;

// Concrete product
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendered the button - HTML");
    }

    @Override
    public void onClick() {
        System.out.println("Rendered the On click button - HTML");
    }
}

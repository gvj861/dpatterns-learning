package com.example.springboot.product;

public class WindowsButton implements  Button {

    @Override
    public void render() {
        System.out.println("Rendered the button - Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Rendered the On click button - Windows");
    }
}

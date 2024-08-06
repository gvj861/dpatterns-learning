package com.example.springboot.dialog;

import com.example.springboot.product.Button;
import com.example.springboot.product.HtmlButton;

// Concrete creator
public class HtmlDialog extends Dialog{

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    @Override
    public Button createButton() {
        HtmlButton button = new HtmlButton();
        return button;
    }
}

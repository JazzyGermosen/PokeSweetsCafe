package com.pluralsight.models;

public class Sweets extends MenuItems {

    private String flavor;

    public Sweets(String name, String size, double totalPrice, String flavor) {
        super(name, size, totalPrice);
        this.flavor = flavor;
    }

    // sweets will have tres leches themed pokemon desert, I choose you pokeball , and Parfait


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}

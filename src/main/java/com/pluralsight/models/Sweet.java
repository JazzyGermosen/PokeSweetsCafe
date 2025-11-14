package com.pluralsight.models;

import com.pluralsight.models.enums.SweetType;

public class Sweet extends MenuItem {

    private SweetType type;
        // this is the objects that a sweet object will have

    // this is the constructor for the sweets class
    // since the price for the sweet objects is stored in the sweet types it will not need to have the price
    public Sweet(double totalPrice, String name, SweetType type) {
        super(totalPrice);
        this.type = type;
    }

    public Sweet(SweetType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "type=" + type +
                '}';
    }
    // getter and setter method
    public SweetType getType() {
        return type;
    }

    public void setType(SweetType type) {
        this.type = type;
    }
}

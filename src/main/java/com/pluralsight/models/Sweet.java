package com.pluralsight.models;

import com.pluralsight.models.enums.SweetType;

public class Sweet extends MenuItem {

    private SweetType type;

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

    public SweetType getType() {
        return type;
    }

    public void setType(SweetType type) {
        this.type = type;
    }
}

package com.pluralsight.models;

import com.pluralsight.models.enums.DrinkType;

public class Drink extends MenuItem {
    // creating the characteristics for drinks
    private DrinkType type;

    public Drink(double totalPrice, DrinkType type) {
        super(totalPrice);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type=" + type +
                '}';
    }

    public DrinkType getType() {
        return type;
    }

    public void setType(DrinkType type) {
        this.type = type;
    }
}

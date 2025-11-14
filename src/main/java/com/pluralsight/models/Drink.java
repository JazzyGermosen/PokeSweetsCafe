package com.pluralsight.models;

import com.pluralsight.models.enums.DrinkType;

public class Drink extends MenuItem {
    // creating the characteristics for drinks
    private DrinkType type;
    private String size;
    public Drink( DrinkType type, String size) {
        super(switch (size.toLowerCase()) {
            case "kids" -> 3.00;
            case "Half" -> 5.50;
            case "Full" -> 8.00;
            default -> 0;
        });

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

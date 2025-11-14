package com.pluralsight.models;

import com.pluralsight.models.enums.DrinkType;

public class Drink extends MenuItem {
    // creating the characteristics for drinks
    private DrinkType type;
    private String size;
    public Drink( DrinkType type, String size) {
        // the super class constructor needs  adouble to function
        // the switch statement will evaluate to a double
        // the double is price
        super(switch (size.toLowerCase()) {
            case "kids" -> 3.00;
            case "Half" -> 5.50;
            case "Full" -> 8.00;
            default -> 0;
        });

    }
    // specific to string method that is for the drink type class
    @Override
    public String toString() {
        return "Drink{" +
                "type=" + type +
                '}';
    }
    // getter and setter methods
    public DrinkType getType() {
        return type;
    }

    public void setType(DrinkType type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

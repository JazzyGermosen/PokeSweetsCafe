package com.pluralsight.models;

public class Drinks extends MenuItems {
    // creating the characteristics for drinks


    public Drinks(String name, String size, double totalPrice, String flavor, boolean isCarbonated, String temp) {
        super(totalPrice);

    }

    public double drinkPrice(String drinkPrice){
        // price for both regular and jumbo size drinks
        return switch (drinkPrice.toLowerCase()){
            case "regular" -> 5.00;
            case "jumbo" -> 9.50;
            default -> 0;
        };
    }


    // adding a list of drink items that can be found

}

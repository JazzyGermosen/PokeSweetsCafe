package com.pluralsight.models.enums;

public enum SweetType {

    ALTARIA("Mega Altaria's Fluffy Tres-Leches", 6.50),
    POKEBAWL("I Choose You", 4.50),
    OSHAWOTT("Oshawott Parfait", 20.00),
    GARCHOMP("Garchomp Souffle", 6.50),
    INFERNAPE("Infernape's Firey Brownies", 4.50);

    // creating an enum class that will help store the names and the price of all the sweet types that we need
    private final String displayName;
    private final double price;

    SweetType(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SweetType{" +
                "displayName='" + displayName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getPrice() {
        return price;
    }
}

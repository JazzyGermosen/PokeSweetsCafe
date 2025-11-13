package com.pluralsight.models.enums;

public enum DrinkType {

    GARDEVOIR("Gardevoir's Matcha Bubble tea", 5.50),
    SYLVEON("Sylveon's Strawberry Bubble Tea", 5.50),
    GENGAR("Gengar's Confuse Ray Smoothie", 8.50),
    FUECOCO("Fuecoco's Apple Soda Float", 5.50),
    MIMIKYU("MimiKyu's Play Rough Smoothie", 6.50),
    SHINX("Shinx's Electrik Soda Float", 5.50);



    private final String displayName;
    private final double price;

    DrinkType(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getPrice() {
        return price;
    }
}

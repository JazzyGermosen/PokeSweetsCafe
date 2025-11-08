package com.pluralsight.models;

public class Order {
    private String platter;
    private String drinks;
    private String sweets;

    public Order(String sandwiches, String drinks, String sweets) {
        this.platter = sandwiches;
        this.drinks = drinks;
        this.sweets = sweets;
    }

    public String getPlatter() {
        return platter;
    }

    public void setPlatter(String platter) {
        this.platter = platter;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getSweets() {
        return sweets;
    }

    public void setSweets(String sweets) {
        this.sweets = sweets;
    }
}

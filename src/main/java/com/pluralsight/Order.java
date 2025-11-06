package com.pluralsight;

public class Order {
    private String sandwiches;
    private String drinks;
    private String sweets;

    public Order(String sandwiches, String drinks, String sweets) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.sweets = sweets;
    }

    public String getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(String sandwiches) {
        this.sandwiches = sandwiches;
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

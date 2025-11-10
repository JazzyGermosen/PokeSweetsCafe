package com.pluralsight.models;

public abstract class Order {
    private String platter;
    private String drinks;
    private String sweets;
    private String sides;
    private String name;
    private String size;
    private double totalPrice;

    public Order(String platter, String drinks, String sweets, String sides, String name, String size, double totalPrice) {
        this.platter = platter;
        this.drinks = drinks;
        this.sweets = sweets;
        this.sides = sides;
        this.name = name;
        this.size = size;
        this.totalPrice = totalPrice;
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

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

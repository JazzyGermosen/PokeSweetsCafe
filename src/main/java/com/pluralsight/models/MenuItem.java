package com.pluralsight.models;

public abstract class MenuItem {


    protected double totalPrice;


    public MenuItem(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public MenuItem() {

    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "totalPrice=" + totalPrice +
                '}';
    }

    // getter and setter methods

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}


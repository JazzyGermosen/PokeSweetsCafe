package com.pluralsight.models;

public abstract class MenuItems {


    private double totalPrice;



    public MenuItems( double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return name + " (" + size + ") - $" + String.format("%.2f", totalPrice);
    }


    // getter and setter methods


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

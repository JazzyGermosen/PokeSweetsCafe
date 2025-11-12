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

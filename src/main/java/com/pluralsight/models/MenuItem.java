package com.pluralsight.models;

public abstract class MenuItem {


    // this is going to be the object that a menu item has that will be shared or inheretted by the child class
    protected double totalPrice;

    // this is the constructor for the menu item class
    public MenuItem(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public MenuItem() {

    }

    // to string that is specific to the menu item
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


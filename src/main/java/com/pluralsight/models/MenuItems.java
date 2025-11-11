package com.pluralsight.models;

public abstract class MenuItems {

    private String name;
    private String size;
    private double totalPrice;



    public MenuItems(String name, String size, double totalPrice) {
        this.name = name;
        this.size = size;
        this.totalPrice = totalPrice;
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

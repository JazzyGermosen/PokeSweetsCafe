package com.pluralsight.models;

public class Sides extends Order {
    // dont know if this will be extending or implimenting to the parent function because toppings comes from sandwhich
    // creating the objects that will be what the topings are
    private String meat;
    private String size;
    private String curry;
    private String veggies;
    private String rice;
    private double totalPrice;
    private String name;

    public Sides(String platter, String drinks, String sweets, String sides, String name, String size, double totalPrice, String meat, String curry, String veggies, String rice, double totalprice, String name1) {
        super(platter, drinks, sweets, sides, name, size, totalPrice);
        this.meat = meat;
        this.size = size;
        this.curry = curry;
        this.veggies = veggies;
        this.rice = rice;
        this.totalPrice = totalprice;
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}

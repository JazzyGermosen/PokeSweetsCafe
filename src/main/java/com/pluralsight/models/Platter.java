package com.pluralsight.models;

public class Platter extends Order {
    private String veggies;
    private String meat;
    private String rice;
    private String curry;


    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches


    public Platter(String platter, String drinks, String sweets, String sides, String name, String size, double totalPrice, String veggies, String meat, String rice, String curry) {
        super(platter, drinks, sweets, sides, name, size, totalPrice);
        this.veggies = veggies;
        this.meat = meat;
        this.rice = rice;
        this.curry = curry;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }
}

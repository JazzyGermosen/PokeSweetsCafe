package com.pluralsight.models;

public class Platter extends MenuItems {
    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches
    // a platter does have veggies rice meat and curry but when creatin a new instance of
    private String veggies;
    private String rice;
    private String curry;
    private String meat;

    public Platter(String name, String size, double totalPrice, String veggies, String rice, String curry, String meat) {
        super(name, size, totalPrice);
        this.veggies = veggies;
        this.rice = rice;
        this.curry = curry;
        this.meat = meat;
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

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}

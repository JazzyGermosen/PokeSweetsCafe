package com.pluralsight.models;

public class Platter extends Order {
    private String veggies;
    private String size;
    private String meat;
    private String Rice;
    private String Curry;
    private int totalPrice;

    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches

    public Platter(String platter, String drinks, String sweets, String veggies, String size, String meat, String Rice, String Curry, int totalPrice) {
        super(platter, drinks, sweets);
        this.veggies = veggies;
        this.size = size;
        this.meat = meat;
        this.Rice = Rice;
        this.Curry = Curry;
        this.totalPrice = totalPrice;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRice() {
        return Rice;
    }

    public void setRice(String rice) {
        this.Rice = rice;
    }

    public String getCurry() {
        return Curry;
    }

    public void setCurry(String curry) {
        this.Curry = curry;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

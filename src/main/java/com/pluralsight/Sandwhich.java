package com.pluralsight;

public class Sandwhich extends Order{
    private String bread;
    private int size;
    private String meat;
    private String toppings;
    private String sauce;
    private int totalPrice;

    public Sandwhich(String sandwiches, String drinks, String sweets, String bread, int size, String meat, String toppings, String sauce, int totalPrice) {
        super(sandwiches, drinks, sweets);
        this.bread = bread;
        this.size = size;
        this.meat = meat;
        this.toppings = toppings;
        this.sauce = sauce;
        this.totalPrice = totalPrice;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

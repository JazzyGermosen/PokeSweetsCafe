package com.pluralsight.models;

public class Sweets extends Order {
    private String size;
    private String drinks;
    private String flavor;
    private String Gummybears;
    private String name;
    private double totalPrice;


    // sweets will have tres leches themed pokemon desert


    public Sweets(String platter, String drinks, String sweets, String sides, String name, String size, double totalPrice, String drinks1, String flavor, String gummybears, String name1, double totalPrice1) {
        super(platter, drinks, sweets, sides, name, size, totalPrice);
        this.size = size;
        this.drinks = drinks;
        this.flavor = flavor;
        this.Gummybears = gummybears;
        this.name = name;
        this.totalPrice = totalPrice1;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String getDrinks() {
        return drinks;
    }


    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getGummybears() {
        return Gummybears;
    }

    public void setGummybears(String gummybears) {
        Gummybears = gummybears;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

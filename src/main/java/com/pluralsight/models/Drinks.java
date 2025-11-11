package com.pluralsight.models;

public class Drinks extends MenuItems {
    // creating the characteristics for drinks
    private String flavor;
    private boolean isCarbonated;
    private String temp;

    public Drinks(String name, String size, double totalPrice, String flavor, boolean isCarbonated, String temp) {
        super(name, size, totalPrice);
        this.flavor = flavor;
        this.isCarbonated = isCarbonated;
        this.temp = temp;
    }

    // adding a list of drink items that can be found

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    public void setCarbonated(boolean carbonated) {
        isCarbonated = carbonated;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}

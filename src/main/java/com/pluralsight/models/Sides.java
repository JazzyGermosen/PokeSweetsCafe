package com.pluralsight.models;

public class Sides {
    // dont know if this will be extending or implimenting to the parent function because toppings comes from sandwhich
    // creating the objects that will be what the topings are
    private String meat;
    private String cheese;
    private String regular;
    private String Sauce;

    public Sides(String meat, String cheese, String regular, String sauce) {
        this.meat = meat;
        this.cheese = cheese;
        this.regular = regular;
        Sauce = sauce;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getSauce() {
        return Sauce;
    }

    public void setSauce(String sauce) {
        Sauce = sauce;
    }
}

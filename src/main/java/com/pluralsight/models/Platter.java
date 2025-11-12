package com.pluralsight.models;

import java.util.ArrayList;

public class Platter extends MenuItems {
    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches
    // a platter does have veggies rice meat and curry but when creatin a new instance of
    // extra meat rice or veggies
    private boolean addOn;
    private String meat;
    private String size;
    // ^^ all the things a plate would have

    // list from sides class
    private ArrayList<Sides> sides = new ArrayList<>();

    public Platter(String name, String size, double totalPrice, boolean addOn, String rice, String curry, String meat) {
        super( totalPrice);
        this.addOn = addOn;
        this.meat = meat;
    }

    // this method will add a side to the order
    // am unsure if this needs to be in the order class
    public void addSide(Sides sides){
        this.sides.add(sides);
        // trying to call from the side class to use in here
    }


    public void findPrice(String platterPrice){
        double basePrice = switch (platterPrice.toLowerCase()){
            case "kids" -> 6.50;
            case "half" -> 8.00;
            case "full" -> 10.50;
            default -> 0;
        };;
        //^ i dont understand why this is needed will ask later
        // the for loop will itterate through the list of sides
        // inside the loop it will check each sides type and then calculate it based off of that

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

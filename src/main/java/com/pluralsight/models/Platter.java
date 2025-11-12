package com.pluralsight.models;

import java.util.ArrayList;

public class Platter extends MenuItems {
    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches
    // a platter does have veggies rice meat and curry but when creatin a new instance of
    // extra meat rice or veggies
    private boolean extraMeat;
    private boolean isSpicy;
    private String name;
    private String meat;
    private String size;
    private sideType type;
    // ^^ all the things a plate would have

    public enum sideType {
        PREMIUM,
        SUSHI,
        EGG,
        REGULAR
    }

    // list from sides class
    private ArrayList<Side> sides = new ArrayList<>();
    private ArrayList<sideType> sideTypes = new ArrayList<>();

    public Platter(double totalPrice, ArrayList<sideType> sideTypes, ArrayList<Side> sides, sideType type, String size, String meat, String name, boolean isSpicy, boolean extraMeat) {
        super(totalPrice);
        this.sideTypes = sideTypes;
        this.sides = sides;
        this.type = type;
        this.size = size;
        this.meat = meat;
        this.name = name;
        this.isSpicy = isSpicy;
        this.extraMeat = extraMeat;
    }

    // focus on everything that comes on the platter
    // anything that can be ordered seperately will be its own class
    // create a list that will store the types
    // shift one of the options to make it a premium options
    // can have an extra meet as a way to add "toppings that would cost more"
    // this method will add a side to the order
    // am unsure if this needs to be in the order class
    public void addSide(SideType sides, Side SideType){
        this.sides.add(SideType);
        // trying to call from the side class to use in here
    }


    public double findTotalPrice(String platterPrice){
        double basePrice = switch (platterPrice.toLowerCase()){
            case "kids" -> 6.50;
            case "half" -> 8.00;
            case "full" -> 10.50;
            default -> 0;
        };;
        //^ i dont understand why this is needed will ask later
        // the for loop will itterate through the list of sides
        // inside the loop it will check each sides type and then calculate it based off of that
        for(Side side : sides){
            basePrice += side.getTotalPrice();
        }
        return getTotalPrice();
    }


    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public sideType getType() {
        return type;
    }

    public void setType(sideType type) {
        this.type = type;
    }

    public ArrayList<Side> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Side> sides) {
        this.sides = sides;
    }
}

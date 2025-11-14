package com.pluralsight.models;

import java.util.ArrayList;

public class Platter extends MenuItem {
    // for future logic instead of sizes with ints i could do kids, half, and full with pricing that matches
    // a platter does have veggies rice meat and curry but when creatin a new instance of
    // extra meat rice or veggies
    private boolean extraMeat;
    private boolean isSpicy;
    private String meat;
    private String size;

    // ^^ all the things a plate would have
    // ctrl left click is cool
    // list from sides class
    private ArrayList<Side> sides = new ArrayList<>();


    public Platter( String size) {
        //this is the platter constructor
        // taking the size of the platter to calculate the base price of the platter to be passed into the super construtor
        super( switch (size.toLowerCase()){
            case "kids" -> 6.50;
            case "half" -> 8.00;
            case "full" -> 10.50;
            default -> 0;
        });

    }

    public Platter() {
        super();
    }

    @Override
    public String toString() {
        return "Platter{" +
                "extraMeat=" + extraMeat +
                ", isSpicy=" + isSpicy +
                ", meat='" + meat + '\'' +
                ", size='" + size + '\'' +
                ", sides=" + sides +
                '}';
    }
    @Override
    public double getTotalPrice(){
        // base price of platter
        // add the price of all the sides to the base price
        // add fee for extra meat
        // return total
        //iterate through the sides array
        double currentTotal = 0 ;
        for(Side side : sides){
            currentTotal += side.getTotalPrice();

        }
        if (extraMeat){
            currentTotal += 2.00;
        }
        this.totalPrice += currentTotal;
        return this.totalPrice;
    }


    public void addSide(Side s){
        this.sides.add(s);
        // trying to call from the side class to use in here
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
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

    public ArrayList<Side> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Side> sides) {
        this.sides = sides;
    }
}

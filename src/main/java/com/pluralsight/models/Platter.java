package com.pluralsight.models;

import java.util.ArrayList;

public class Platter extends MenuItems {
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

    public double getPrice(){
        // base price of platter
        // add the price of all the sides to the base price
        // add fee for extra meat
        // return total
        //iterate through the sides array
        double currentTotal = this.getTotalPrice();
        for(Side side : sides){
            currentTotal += side.getTotalPrice();

        }
        if (extraMeat){
            currentTotal += 2.00;
        }
        return currentTotal;
    }


    public void addSide(Side s){
        this.sides.add(s);
        // trying to call from the side class to use in here
    }

}

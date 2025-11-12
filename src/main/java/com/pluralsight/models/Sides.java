package com.pluralsight.models;

public class Sides {
    // dont know if this will be extending or implimenting to the parent function because toppings comes from sandwhich
    // creating the objects that will be what the topings are
   // since sides would be something thats added and seperate i have to figure out a different logic flow for this class
    private String veggies;
    private String rice;
    private String curry;
    private String meat;

    public Sides( double totalPrice, String veggies, String rice, String curry, String meat) {

        this.veggies = veggies;
        this.rice = rice;
        this.curry = curry;
        this.meat = meat;
    }


    public double priceForSide(String sidePrice){
        return switch (sidePrice.toLowerCase()){
            case "kids" -> 3.00;
            case "full" -> 5.00;
            default -> 0;
        };
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

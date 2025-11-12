package com.pluralsight.models;

public class Side extends MenuItems  {
    // dont know if this will be extending or implimenting to the parent function because toppings comes from sandwhich
    // creating the objects that will be what the topings are
   // since sides would be something thats added and seperate i have to figure out a different logic flow for this class
    private sideType type;
    private String name;

    public Side(double totalPrice, sideType type, String name) {
        super(totalPrice);
        this.type = type;
        this.name = name;
    }

    // create an enum to describe the type of side that it is ( reg , premium ect)
    // so that when we go to the platter we will have an easier way to tell what it is
    // enum sidetype ( list of words from sushi egg and regular )
    // when you make a side object it would have 2 properties
    // the name of the side and the type of the side and it has to be from the enum that we defined
    // private toppingtype type;
    // its going to itterate through the list of side and check the number of sides
    // once it does know the number of sides it will do the calculations based off of that


    public double priceForSide(String sidePrice){
        return switch (sidePrice.toLowerCase()){
            case "kids" -> 3.00;
            case "full" -> 5.00;
            default -> 0;
        };
        // method for finding price of side if it is an extra order ??
    }
    @Override
    public String toString(){
        return type.toString();
    }

        public enum sideType {

        }

    public sideType getType() {
        return type;
    }

    public void setType(sideType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.pluralsight.models;

import com.pluralsight.models.enums.SideType;

public class Side extends MenuItem {
    // dont know if this will be extending or implimenting to the parent function because toppings comes from sandwhich
    // creating the objects that will be what the topings are
    // since sides would be something thats added and seperate i have to figure out a different logic flow for this class
    private SideType type;
    private String size;

    // this is the objects that a side class will have

    public Side(SideType type, String size) {
        // this is where the price is stored for the price of the side
        super(switch (size.toLowerCase()){
            case "kids" -> 3.00;
            case "full" -> 5.00;
            default -> 0;
        });
    }

    @Override
    public String toString(){
        return type.toString();
    }

    public SideType getType() {
        return type;
    }

    public void setType(SideType type) {
        this.type = type;
    }


}

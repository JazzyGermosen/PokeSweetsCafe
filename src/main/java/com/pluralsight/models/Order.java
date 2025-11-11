package com.pluralsight.models;

import java.awt.*;
import java.util.ArrayList;

public class Order {
    // pulling from MenuItems class
    private ArrayList<MenuItems> items = new ArrayList<>();

    public void addItem(MenuItems items){
        items.add(items);
    }

    public double totalPrice(){
        double total = 0;
        for (MenuItems items : items) total += items.getTotalPrice();
        return total;
    }

}
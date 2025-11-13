package com.pluralsight.models;

import java.util.ArrayList;

public class Order {
    // pulling from MenuItems class
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Order() {
        //Initializing class properties
        this.items = items;
    }

    public void addItem(MenuItem items){
        // adds item to the items list
        this.items.add(items);
    }

    public double totalPrice(){
        double total = 0;
        for (MenuItem items : items) total += items.getTotalPrice();
        return total;
        //returns the total of the list
    }

    public void deleteItem(MenuItem item){

    }

    public MenuItem getItems(MenuItem item){
        return item;
    }

}
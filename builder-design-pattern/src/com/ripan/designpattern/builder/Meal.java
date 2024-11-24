package com.ripan.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public double getPrice(){
        double cost = 0.0;

        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Items: " +item.name());
            System.out.print(", Packing: " +item.packing().pack());
            System.out.println(", Price: " +item.price());
        }
    }
}

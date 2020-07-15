package com.MyTesting;

import java.text.NumberFormat;
import java.util.ArrayList;

public class InPuts extends InPutOutPut{
    private double price;
    private ArrayList<ShopItems> items;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public InPuts() {
        this.items = new ArrayList<ShopItems>();
   }

    public void addItems(ShopItems items) {
        double newPrice = items.getPrice();
        System.out.println("1 " + items + " for " + formatter.format(newPrice));
        this.items.add(items);
        price += newPrice;
    }

    public ArrayList<ShopItems> getItems() {
        for (ShopItems item : items) {
            System.out.println("Added " + item.getItem());
        }
        return this.items;
    }
}

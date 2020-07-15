package com.MyTesting;

import java.text.NumberFormat;
import java.util.ArrayList;

public class OutPuts extends InPutOutPut {
    private double price;
    private double tax;
    private ArrayList<ShopItems> items;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public OutPuts() {
        this.items = new ArrayList<ShopItems>();
    }

    public void addItems(ShopItems items) {
        double newPrice = items.getPrice() * items.getTax();
        double newTax = newPrice - items.getPrice();
        System.out.println("1 " + items + " for " + formatter.format(newPrice));
        this.items.add(items);
        price += newPrice;
        tax += newTax;
    }

    public ArrayList<ShopItems> getItems() {
        for (ShopItems item : items) {
        }
        return this.items;
    }

    public double getPrice() {
        return price;

    }

    public double getTax() {
        return tax;
    }
}



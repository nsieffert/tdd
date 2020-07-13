package com.MyTesting;

import java.text.NumberFormat;
import java.util.ArrayList;

public class OutPuts extends InPutOutPut{
    private double price;
    private double tax;
    private ArrayList<ShopItems> items;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public OutPuts() {
        this.price = price;
        this.tax = tax;
        this.items = new ArrayList<ShopItems>();
    }
    public void addItems(ShopItems items) {
        double newPrice = items.getPrice() + items.getTax();
        System.out.println("1 " + items + " for " + formatter.format(newPrice));
            this.items.add(items);
            price += newPrice;
            tax += tax;
        }
    public ArrayList<ShopItems> getItems() {
        for (ShopItems item : items) {
            System.out.println("Added " + item.getItem());
        }
        return this.items;
    }
    public double totalOutPutPrice() {
        double finalPrice  = this.price;
        for(int i = 0; i < items.size(); i++){
            ShopItems checkOut  = this.items.get(i);
            price += checkOut.getPrice();
            for(i = 0; i < items.size(); i++){
                checkOut  = this.items.get(i);
                tax += checkOut.getTax();
            }
        }
        System.out.println("Sales Taxes: " + formatter.format(tax) + " Total: " + formatter.format(finalPrice));
        return finalPrice;
    }
    }



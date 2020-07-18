package com.MyTesting;

import java.text.NumberFormat;

public class ImportedChocolatesLarge {
    private final String NAME = "Imported Chocolates (large)";
    private final double PRICE = 11.25;
    private final double TAX = .05;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static ImportedChocolatesLarge getInstance(){
        return new ImportedChocolatesLarge();
    }
    public String getNAME() {
        return NAME;
    }
    public double originalPrice(){
        formatter.format(PRICE);
        return PRICE;
    }
    public double getPRICE() {
        return (PRICE * TAX) + PRICE;
    }

    public double getTAX() {
        double withTax = PRICE * TAX;
        formatter.format(withTax);
        return withTax;

    }
}
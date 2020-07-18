package com.MyTesting;

import java.text.NumberFormat;

public class Perfume extends Merchandise {
    private final String NAME = "Perfume";
    private final double PRICE = 18.99;
    private final double TAX = .10;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static Perfume getInstance(){
        return new Perfume();
    }
    public String getNAME() {
        return NAME;
    }
    public double getOriginalPrice(){
        formatter.format(PRICE);
        return PRICE;
    }
    public double getAfterTaxPrice() {
        return (PRICE * TAX) + PRICE;
    }

    public double getTAX() {
        double withTax = PRICE * TAX;
        formatter.format(withTax);
        return withTax;

    }
}

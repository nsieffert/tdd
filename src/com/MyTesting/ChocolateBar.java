package com.MyTesting;

import java.text.NumberFormat;

public class ChocolateBar extends Merchandise {
    private final String NAME = "Chocolate Bar";
    private final double PRICE = .85;
    private final double TAX = 0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static ChocolateBar getInstance(){
        return new ChocolateBar();
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


package com.MyTesting;


import java.text.NumberFormat;

public class MusicCD extends Merchandise {
    private final String NAME = "Music CD";
    private final double PRICE = 14.99;
    private final double TAX = .10;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public static MusicCD getInstance(){
        return new MusicCD();
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

package com.MyTesting;

import java.text.NumberFormat;

public class HeadachePills extends Merchandise {
    private final String NAME = "Headache Pills";
    private final double PRICE = 9.75;
    private final double TAX = 0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static HeadachePills getInstance(){
        return new HeadachePills();
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
package com.MyTesting;

import java.text.NumberFormat;

public class Book extends Merchandise {
    private final String NAME = "Book";
    private final double PRICE = 12.49;
    private final double TAX = 0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static Book getInstance(){
        return new Book();
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

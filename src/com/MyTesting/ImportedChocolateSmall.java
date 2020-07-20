package com.MyTesting;

import java.text.NumberFormat;

public class ImportedChocolateSmall extends Merchandise {
    private final String NAME = "Imported Chocolates (small)";
    private final double PRICE = 10.00;
    private final double TAX = .05;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static ImportedChocolateSmall getInstance(){
        return new ImportedChocolateSmall();
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
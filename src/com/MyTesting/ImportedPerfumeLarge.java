package com.MyTesting;

import java.text.NumberFormat;

public class ImportedPerfumeLarge {
    private final String NAME = "Imported Perfume (large)";
    private final double PRICE = 47.50;
    private final double TAX = .15;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static ImportedPerfumeLarge getInstance() {
        return new ImportedPerfumeLarge();
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


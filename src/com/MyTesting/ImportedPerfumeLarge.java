package com.MyTesting;

import java.text.NumberFormat;

public class ImportedPerfumeLarge extends Merchandise {
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


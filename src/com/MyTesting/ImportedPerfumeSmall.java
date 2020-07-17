package com.MyTesting;

import java.text.NumberFormat;

public class ImportedPerfumeSmall {
    private final String NAME = "Imported Perfume (small)";
    private final double PRICE = 27.99;
    private final double TAX = .15;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    public static ImportedPerfumeSmall getInstance(){
        return new ImportedPerfumeSmall();
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
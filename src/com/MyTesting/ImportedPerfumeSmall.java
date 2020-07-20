package com.MyTesting;

import java.text.NumberFormat;

public class ImportedPerfumeSmall extends Merchandise {
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
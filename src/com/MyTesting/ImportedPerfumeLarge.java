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
        double afterTax = (PRICE * TAX) + PRICE;
        double finalAfterTax = Math.round(afterTax * 20.0) / 20.0;
        formatter.format(finalAfterTax);
        return finalAfterTax;
    }

    public double getTAX() {
        double withTax = PRICE * TAX;
        double finalWithTax = Math.round(withTax * 20.0) / 20.0;
        formatter.format(finalWithTax);
        return finalWithTax;

    }
}


package com.MyTesting;

import java.text.NumberFormat;

public class ImportedChocolatesLarge extends Merchandise {
    private final String NAME = "Imported Chocolates (large)";
    private final double PRICE = 11.25;
    private final double TAX = .05;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public static ImportedChocolatesLarge getInstance() {
        return new ImportedChocolatesLarge();
    }

    public String getNAME() {
        return NAME;
    }

    public double getOriginalPrice() {
        formatter.format(PRICE);
        return PRICE;
    }

    public double getAfterTaxPrice() {
        double afterTax = (PRICE * TAX) + PRICE;
        double finalAfterTax = Math.ceil(afterTax * 20.0) / 20.0;
        formatter.format(finalAfterTax);
        return finalAfterTax;
    }

    public double getTAX() {
        double withTax = PRICE * TAX;
        double finalWithTax = Math.ceil(withTax * 20.0) / 20.0;
        formatter.format(finalWithTax);
        return finalWithTax;
    }
}
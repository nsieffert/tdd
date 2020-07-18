package com.MyTesting;

import java.text.NumberFormat;

public class TPrintAllItems {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static TPrintAllItems getInstance(){
        return new TPrintAllItems();
    }

    public void printAll(){
        System.out.println("Input One:");
        System.out.println("1 " + Book.getInstance().getNAME() + " for "
                + Book.getInstance().getOriginalPrice());
        System.out.println("1 " + MusicCD.getInstance().getNAME() + " for "
                + MusicCD.getInstance().getOriginalPrice());
        System.out.println("1  " + ChocolateBar.getInstance().getNAME() + " for "
                + ChocolateBar.getInstance().getOriginalPrice());
        System.out.println("==============");

        System.out.println("Input Two:");
        System.out.println("1 " + ImportedChocolateSmall.getInstance().getNAME() + " for "
                + ImportedChocolateSmall.getInstance().getOriginalPrice());
        System.out.println("1 " + ImportedPerfumeLarge.getInstance().getNAME() + " for "
                + ImportedPerfumeLarge.getInstance().getOriginalPrice());
        System.out.println("==============");

        System.out.println("Input Three:");
        System.out.println("1 " + ImportedPerfumeSmall.getInstance().getNAME() + " for "
                + ImportedPerfumeSmall.getInstance().getOriginalPrice());
        System.out.println("1 " + Perfume.getInstance().getNAME() + " for "
                + Perfume.getInstance().getOriginalPrice());
        System.out.println("1 " + HeadachePills.getInstance().getNAME() + " for "
                + HeadachePills.getInstance().getOriginalPrice());
        System.out.println("1 " + ImportedChocolatesLarge.getInstance().getNAME() + " for "
                + ImportedChocolatesLarge.getInstance().getOriginalPrice());
        System.out.println("==============");


        System.out.println("Output One:");
        System.out.println("1 " + Book.getInstance().getNAME() + " for "
                + formatter.format(Book.getInstance().getAfterTaxPrice()));
        System.out.println("1 " + MusicCD.getInstance().getNAME() + " for "
                + formatter.format(MusicCD.getInstance().getAfterTaxPrice()));
        System.out.println("1  " + ChocolateBar.getInstance().getNAME()
                + " for " + formatter.format(ChocolateBar.getInstance().getAfterTaxPrice()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputOneTax() + " Total "
                + OutPutPricing.getInstance().outputOnePricing());
                System.out.println("==============");

        System.out.println("Output Two:");
        System.out.println("1 " + ImportedChocolateSmall.getInstance().getNAME() + " for "
                + formatter.format(ImportedChocolateSmall.getInstance().getAfterTaxPrice()));
        System.out.println("1 " + ImportedPerfumeLarge.getInstance().getNAME() + " for "
                + formatter.format(ImportedPerfumeLarge.getInstance().getAfterTaxPrice()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputTwoTax()
                + " Total " + OutPutPricing.getInstance().outputTwoPricing());
        System.out.println("==============");

        System.out.println("OutputThree:");
        System.out.println("1 " + ImportedPerfumeSmall.getInstance().getNAME() + " for "
                + formatter.format(ImportedPerfumeSmall.getInstance().getAfterTaxPrice()));
        System.out.println("1 " + Perfume.getInstance().getNAME() + " for "
                + formatter.format(Perfume.getInstance().getAfterTaxPrice()));
        System.out.println("1 " + HeadachePills.getInstance().getNAME() + " for "
                + formatter.format(HeadachePills.getInstance().getAfterTaxPrice()));
        System.out.println("1 " + ImportedChocolatesLarge.getInstance().getNAME() + " for "
                + formatter.format(ImportedChocolatesLarge.getInstance().getAfterTaxPrice()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputThreeTax() + " Total "
                + OutPutPricing.getInstance().outputThreePricing());
        System.out.println("==============");
    }
}

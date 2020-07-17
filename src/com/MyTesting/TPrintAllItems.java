package com.MyTesting;

import java.text.NumberFormat;

public class TPrintAllItems {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static TPrintAllItems getInstance(){
        return new TPrintAllItems();
    }

    public void printAll(){
        System.out.println("Input One:");
        System.out.println("1 " + Book.getInstance().getNAME() + " for " + Book.getInstance().originalPrice());
        System.out.println("1 " + MusicCD.getInstance().getNAME() + " for " + MusicCD.getInstance().originalPrice());
        System.out.println("1  " + ChocolateBar.getInstance().getNAME() + " for " + ChocolateBar.getInstance().originalPrice());
        System.out.println("==============");

        System.out.println("Input Two:");
        System.out.println("1 " + ImportedChocolateSmall.getInstance().getNAME() + " for " + ImportedChocolateSmall.getInstance().originalPrice());
        System.out.println("1 " + ImportedPerfumeLarge.getInstance().getNAME() + " for " + ImportedPerfumeLarge.getInstance().originalPrice());
        System.out.println("==============");

        System.out.println("Input Three:");
        System.out.println("1 " + ImportedPerfumeSmall.getInstance().getNAME() + " for " + ImportedPerfumeSmall.getInstance().originalPrice());
        System.out.println("1 " + Perfume.getInstance().getNAME() + " for " + Perfume.getInstance().originalPrice());
        System.out.println("1 " + HeadachePills.getInstance().getNAME() + " for " + HeadachePills.getInstance().originalPrice());
        System.out.println("1 " + ImportedChocolatesLarge.getInstance().getNAME() + " for " + ImportedChocolatesLarge.getInstance().originalPrice());
        System.out.println("==============");


        System.out.println("Output One:");
        System.out.println("1 " + Book.getInstance().getNAME() + " for " + formatter.format(Book.getInstance().getPRICE()));
        System.out.println("1 " + MusicCD.getInstance().getNAME() + " for " + formatter.format(MusicCD.getInstance().getPRICE()));
        System.out.println("1  " + ChocolateBar.getInstance().getNAME() + " for " + formatter.format(ChocolateBar.getInstance().getPRICE()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputOneTax() + " Total " + OutPutPricing.getInstance().outputOnePricing());
                System.out.println("==============");

        System.out.println("Output Two:");
        System.out.println("1 " + ImportedChocolateSmall.getInstance().getNAME() + " for " + formatter.format(ImportedChocolateSmall.getInstance().getPRICE()));
        System.out.println("1 " + ImportedPerfumeLarge.getInstance().getNAME() + " for " + formatter.format(ImportedPerfumeLarge.getInstance().getPRICE()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputTwoTax() + " Total " + OutPutPricing.getInstance().outputTwoPricing());
        System.out.println("==============");

        System.out.println("OutputThree:");
        System.out.println("1 " + ImportedPerfumeSmall.getInstance().getNAME() + " for " + formatter.format(ImportedPerfumeSmall.getInstance().getPRICE()));
        System.out.println("1 " + Perfume.getInstance().getNAME() + " for " + formatter.format(Perfume.getInstance().getPRICE()));
        System.out.println("1 " + HeadachePills.getInstance().getNAME() + " for " + formatter.format(HeadachePills.getInstance().getPRICE()));
        System.out.println("1 " + ImportedChocolatesLarge.getInstance().getNAME() + " for " + formatter.format(ImportedChocolatesLarge.getInstance().getPRICE()));
        System.out.println("Sales Taxes " + OutPutPricing.getInstance().outputThreeTax() + " Total " + OutPutPricing.getInstance().outputThreePricing());
        System.out.println("==============");
    }
}

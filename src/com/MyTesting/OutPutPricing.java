package com.MyTesting;

import java.text.NumberFormat;

public class OutPutPricing {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static OutPutPricing getInstance(){
        return new OutPutPricing();
    }

    public String outputOnePricing() {
            double totalPrice;
            totalPrice = ChocolateBar.getInstance().getAfterTaxPrice() + Book.getInstance().getAfterTaxPrice()
                    + MusicCD.getInstance().getAfterTaxPrice();
            return formatter.format(totalPrice);
        }
        public String outputOneTax() {
            double totalTax;
            totalTax = ChocolateBar.getInstance().getTAX() + MusicCD.getInstance().getTAX()
                   + Book.getInstance().getTAX();
            return formatter.format(totalTax);

        }

    public String outputTwoPricing() {
        double totalPrice = ImportedChocolateSmall.getInstance().getAfterTaxPrice()
                + ImportedPerfumeLarge.getInstance().getAfterTaxPrice();
        return formatter.format(totalPrice);
    }
    public String outputTwoTax() {
        double totalTax = ImportedChocolateSmall.getInstance().getTAX()
                + ImportedPerfumeLarge.getInstance().getTAX();
        return formatter.format(totalTax);
    }

    public String outputThreePricing() {
        double totalPrice;
        totalPrice = ImportedPerfumeSmall.getInstance().getAfterTaxPrice() + Perfume.getInstance().getAfterTaxPrice() +
                HeadachePills.getInstance().getAfterTaxPrice() + ImportedChocolatesLarge.getInstance().getAfterTaxPrice();
        return formatter.format(totalPrice);
    }
    public String outputThreeTax() {
            double totalTax = ImportedPerfumeSmall.getInstance().getTAX() + Perfume.getInstance().getTAX() +
                    HeadachePills.getInstance().getTAX() + ImportedChocolatesLarge.getInstance().getTAX();
            return formatter.format(totalTax);
        }

    }

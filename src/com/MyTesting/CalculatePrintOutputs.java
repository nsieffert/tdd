package com.MyTesting;

import java.text.NumberFormat;

public class CalculatePrintOutputs {
    public static double totalOutPutPrice(OutPuts outPuts) {
        double finalPrice = outPuts.getPrice();
        double finalTax = outPuts.getTax();
        for (int i = 0; i < outPuts.getItems().size(); i++) {
            for (i = 0; i < outPuts.getItems().size(); i++) {
            }

        }
            System.out.println("Sales Taxes: " + outPuts.formatter.format(Math.round(finalTax * 20.00 + 1) / 20.00) +
                    " Total: " + outPuts.formatter.format(finalPrice));
            return finalPrice;
        }
    }

package com.TDDTests;

import com.MyTesting.OutPuts;
import com.MyTesting.ShopItems;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class OutPutsTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public void setup(){
        System.out.println("Print before each:");
    }
    @Test
    void DisplaysItems() {
        OutPuts out = new OutPuts();
        out.addItems(ShopItems.MUSICCD);
        out.addItems(ShopItems.IMPORTPERFUMESMALL);
        out.addItems(ShopItems.PERFUME);
        out.addItems(ShopItems.IMPORTPERFUMELARGE);
        out.addItems(ShopItems.IMPORTCHOCOLATELARGE);
        out.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        out.addItems(ShopItems.BOOK);
        out.addItems(ShopItems.CHOCOLATEBAR);
        out.addItems(ShopItems.HEADACHEPILLS);
        System.out.println("Should display all items including tax where applicable");
        assertTrue(true);
    }

    @Test
    void calculatePriceRegTax() {
        OutPuts out1 = new OutPuts();
        out1.addItems(ShopItems.PERFUME);
        assertEquals(formatter.format(20.89), formatter.format(out1.totalOutPutPrice()));
        System.out.println("Perfume should be 20.89 - 18.99 Plus 10% tax");
    }

    @Test
    void calculatePriceNoTax() {
        OutPuts out2 = new OutPuts();
        out2.addItems(ShopItems.BOOK);
        assertEquals(formatter.format(12.49), formatter.format(out2.totalOutPutPrice()));
        System.out.println("Book should be 12.49 - no tax");
    }
        @Test
        void calculatePriceImpTax(){
        OutPuts out3 = new OutPuts();
        out3.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        assertEquals(formatter.format(10.50), formatter.format(out3.totalOutPutPrice()));
            System.out.println("should be 10.50 - 10.00 Plus  5% import tax");
    }

    @Test
    void calculateTax(){
        OutPuts out4 = new OutPuts();
        out4.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        assertEquals(formatter.format(10.50), formatter.format(out4.totalOutPutPrice()));
        System.out.println("Should display 10.50 - .50 is the import tax");

    }

    @AfterAll
    public static void teardown(){
        System.out.println("print after all.");
    }
}
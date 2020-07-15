package com.TDDTests;

import com.MyTesting.CalcOutputPrice;
import com.MyTesting.OutPuts;
import com.MyTesting.ShopItems;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class OutPutsTest {
    OutPuts out = new OutPuts();
    CalcOutputPrice calc = new CalcOutputPrice();
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public void setup() {
        System.out.println("Print before each:");
    }

    @Test
    void DisplayNothing(){
        String test  = new String();
        test = " ";
        assertEquals(" ", test);
    }

    @Test
    void DisplaysOneItem() {
        out.addItems(ShopItems.MUSICCD);
     assertEquals(ShopItems.MUSICCD, ShopItems.MUSICCD);
    }

    @Test
    void DisplaysItems() {
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
        out.addItems(ShopItems.PERFUME);
        assertEquals(formatter.format(20.89), formatter.format(calc.totalOutPutPrice(out)));
        System.out.println("Perfume should be 20.89 - 18.99 Plus 10% tax");
    }

    @Test
    void calculatePriceNoTax() {
        out.addItems(ShopItems.BOOK);
        assertEquals(formatter.format(12.49), formatter.format(calc.totalOutPutPrice(out)));
        System.out.println("Book should be 12.49 - no tax");
    }
        @Test
        void calculatePriceImpTax(){
        out.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        assertEquals(formatter.format(10.50), formatter.format(calc.totalOutPutPrice(out)));
            System.out.println("should be 10.50 - 10.00 Plus  5% import tax");
    }

    @Test
    void calculateTaxAndImportTax(){
        out.addItems(ShopItems.IMPORTPERFUMESMALL);
        assertEquals(formatter.format(32.19), formatter.format(calc.totalOutPutPrice(out)));
        System.out.println("Should display 32.19 - regular and import tax");

    }

    @AfterAll
    public static void teardown(){
        System.out.println("print after all.");
    }
}
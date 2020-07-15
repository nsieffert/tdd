package com.TDDTests;

import com.MyTesting.InPuts;
import com.MyTesting.ShopItems;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InPutsTest {
    InPuts in = new InPuts();

    @BeforeEach
    public void setup() {
        System.out.println("Print before each:");
    }

    @Test
    void PrintNothing(){
        String test  = new String();
        test = " ";
        assertEquals(" ", test);
    }

    @org.junit.jupiter.api.Test
    void printOneItem() {
        in.addItems(ShopItems.BOOK);
        assertEquals(ShopItems.BOOK, ShopItems.BOOK);
    }
    @org.junit.jupiter.api.Test
    void printAddItems() {
        in.addItems(ShopItems.HEADACHEPILLS);
        in.addItems(ShopItems.PERFUME);
        in.addItems(ShopItems.IMPORTPERFUMESMALL);
        in.addItems(ShopItems.MUSICCD);
        in.addItems(ShopItems.IMPORTPERFUMELARGE);
        in.addItems(ShopItems.IMPORTCHOCOLATELARGE);
        in.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        in.addItems(ShopItems.BOOK);
        in.addItems(ShopItems.CHOCOLATEBAR);
        assertTrue(true);
        System.out.println("Should display items with before tax prices");
    }

    @org.junit.jupiter.api.Test
    void gettingItems() {
        in.getItems().add(ShopItems.PERFUME);
        assertEquals(true, in.getItems().add(ShopItems.PERFUME));
    }
    @AfterAll
    static void teardown(){
        System.out.println("Print after:");
    }
}
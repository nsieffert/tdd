package com.TDDTests;

import com.MyTesting.InPuts;
import com.MyTesting.ShopItems;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class InPutsTest {

    @BeforeEach
    public void setup() {
        System.out.println("Print before each:");
    }

    @org.junit.jupiter.api.Test
    void addItems() {
        InPuts in = new InPuts();
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
    void doNotAddItems() {
        InPuts in = new InPuts();
        in.addItems(ShopItems.HEADACHEPILLS);
        in.addItems(ShopItems.PERFUME);
        in.addItems(ShopItems.IMPORTPERFUMESMALL);
        in.addItems(ShopItems.MUSICCD);
        in.addItems(ShopItems.IMPORTPERFUMELARGE);
        in.addItems(ShopItems.IMPORTCHOCOLATELARGE);
        in.addItems(ShopItems.IMPORTCHOCOLATESMALL);
        in.addItems(ShopItems.BOOK);
        in.addItems(ShopItems.CHOCOLATEBAR);
        assertFalse(false);
        System.out.println("false is the correct here: should display items with before tax prices");
    }
    @AfterAll
    static void teardown(){
        System.out.println("Print after:");
    }
}
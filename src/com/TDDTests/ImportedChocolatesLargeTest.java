package com.TDDTests;

import com.MyTesting.ImportedChocolatesLarge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;


class ImportedChocolatesLargeTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Imported Chocolates (large)";
        String actual = ImportedChocolatesLarge.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double expected = 11.25;
        double actual = ImportedChocolatesLarge.getInstance().getOriginalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$11.85";
        assertEquals(expected, formatter.format(ImportedChocolatesLarge.getInstance().getAfterTaxPrice()));
    }

    @Test
    void getTax() {
        String expected = "$0.60";
        assertEquals(expected, formatter.format(ImportedChocolatesLarge.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
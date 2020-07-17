package com.TDDTests;

import com.MyTesting.ImportedChocolatesLarge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ImportedChocolatesLargeTest {

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
        double actual = ImportedChocolatesLarge.getInstance().originalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 11.85;
        double actual = ImportedChocolatesLarge.getInstance().getPRICE();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = .60;
        double actual = ImportedChocolatesLarge.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
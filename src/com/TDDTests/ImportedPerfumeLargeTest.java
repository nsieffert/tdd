package com.TDDTests;

import com.MyTesting.ImportedPerfumeLarge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ImportedPerfumeLargeTest {

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Imported Perfume (large)";
        String actual = ImportedPerfumeLarge.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double expected = 47.50;
        double actual = ImportedPerfumeLarge.getInstance().originalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 54.65;
        double actual = ImportedPerfumeLarge.getInstance().getPRICE();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = 7.15;
        double actual = ImportedPerfumeLarge.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
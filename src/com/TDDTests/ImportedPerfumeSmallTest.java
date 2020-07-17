package com.TDDTests;


import com.MyTesting.ImportedPerfumeSmall;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ImportedPerfumeSmallTest {

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Imported Perfume (small)";
        String actual = ImportedPerfumeSmall.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double expected = 27.99;
        double actual = ImportedPerfumeSmall.getInstance().originalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 32.19;
        double actual = ImportedPerfumeSmall.getInstance().getPRICE();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = 4.20;
        double actual = ImportedPerfumeSmall.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
package com.TDDTests;


import com.MyTesting.ImportedChocolateSmall;
import com.MyTesting.ImportedPerfumeSmall;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;


class ImportedPerfumeSmallTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

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
        String expected = "$27.99";
        assertEquals(expected, formatter.format(ImportedPerfumeSmall.getInstance().originalPrice()));
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$32.19";
        assertEquals(expected, formatter.format(ImportedPerfumeSmall.getInstance().getPRICE()));
    }

    @Test
    void getTax() {
        String expected = "$4.20";
        assertEquals(expected, formatter.format(ImportedPerfumeSmall.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
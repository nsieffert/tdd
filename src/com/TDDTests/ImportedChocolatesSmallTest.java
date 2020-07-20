package com.TDDTests;

import com.MyTesting.ImportedChocolateSmall;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;


class ImportedChocolatesSmallTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Imported Chocolates (small)";
        String actual = ImportedChocolateSmall.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        String expected = "$10.00";
        assertEquals(expected, formatter.format(ImportedChocolateSmall.getInstance().getOriginalPrice()));
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$10.50";
        assertEquals(expected, formatter.format(ImportedChocolateSmall.getInstance().getAfterTaxPrice()));
    }

    @Test
    void getTax() {
        String expected = "$0.50";
        assertEquals(expected, formatter.format(ImportedChocolateSmall.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
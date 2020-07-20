package com.TDDTests;

import com.MyTesting.ImportedPerfumeLarge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;


class ImportedPerfumeLargeTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

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
        String expected = "$47.50";
        assertEquals(expected, formatter.format(ImportedPerfumeLarge.getInstance().getOriginalPrice()));
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$54.65";
        assertEquals(expected, formatter.format(ImportedPerfumeLarge.getInstance().getAfterTaxPrice()));
    }

    @Test
    void getTax() {
        String expected = "$7.15";
        assertEquals(expected, formatter.format(ImportedPerfumeLarge.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
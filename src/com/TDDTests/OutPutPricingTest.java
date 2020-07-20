package com.TDDTests;

import com.MyTesting.OutPutPricing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class OutPutPricingTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @BeforeEach
    void setUp() {
        System.out.println("Print before each.");
    }

    @Test
    void getInstance() {
        OutPutPricing expected = OutPutPricing.getInstance();
        assertTrue(true);
    }

    @Test
    void outputOnePricing() {
        String expected = "$29.83";
        assertEquals(expected, OutPutPricing.getInstance().outputOnePricing());
    }

    @Test
    void outputOneTax() {
        String expected = "$1.50";
        assertEquals(expected, OutPutPricing.getInstance().outputOneTax());
    }

    @Test
    void outputTwoPricing() {
        String expected = "$65.15";
        assertEquals(expected, OutPutPricing.getInstance().outputTwoPricing());
    }

    @Test
    void outputTwoTax() {
        String expected = "$7.65";
        assertEquals(expected, OutPutPricing.getInstance().outputTwoTax());
    }

    @Test
    void outputThreePricing() {
        String expected = "$74.68";
        assertEquals(expected, OutPutPricing.getInstance().outputThreePricing());
    }

    @Test
    void outputThreeTax() {
        String expected = "$6.70";
        assertEquals(expected, OutPutPricing.getInstance().outputThreeTax());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Print after each.");
    }
}
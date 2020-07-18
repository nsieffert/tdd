package com.TDDTests;

import com.MyTesting.OutPutPricing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutPutPricingTest {

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
        double expected = 29.83;
        assertEquals(expected, OutPutPricing.getInstance().outputOnePricing());
    }

    @Test
    void outputOneTax() {
        double expected = 1.50;
        assertEquals(expected, OutPutPricing.getInstance().outputOneTax());
    }

    @Test
    void outputTwoPricing() {
        double expected = 65.15;
        assertEquals(expected, OutPutPricing.getInstance().outputTwoPricing());
    }

    @Test
    void outputTwoTax() {
        double expected = 7.65;
        assertEquals(expected, OutPutPricing.getInstance().outputTwoTax());
    }

    @Test
    void outputThreePricing() {
        double expected = 74.68;
        assertEquals(expected, OutPutPricing.getInstance().outputThreePricing());
    }

    @Test
    void outputThreeTax() {
        double expected = 6.70;
        assertEquals(expected, OutPutPricing.getInstance().outputThreeTax());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Print after each.");
    }
}
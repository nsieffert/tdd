package com.TDDTests;

import com.MyTesting.HeadachePills;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HeadachePillsTest {

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Headache Pills";
        String actual = HeadachePills.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double expected = 9.75;
        double actual = HeadachePills.getInstance().getOriginalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 9.75;
        double actual = HeadachePills.getInstance().getAfterTaxPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = 0;
        double actual = HeadachePills.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
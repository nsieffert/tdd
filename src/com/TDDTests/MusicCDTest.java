package com.TDDTests;

import com.MyTesting.MusicCD;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicCDTest {

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Music CD";
        String actual = MusicCD.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double actual = 14.99;
        double expected = MusicCD.getInstance().originalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 16.49;
        double actual = MusicCD.getInstance().getPRICE();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = 1.50;
        double actual = MusicCD.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}

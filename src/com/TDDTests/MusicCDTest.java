package com.TDDTests;

import com.MyTesting.MusicCD;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicCDTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

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
        String expected = "$14.99";
        assertEquals(expected, formatter.format(MusicCD.getInstance().getOriginalPrice()));
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$16.49";
        assertEquals(expected, formatter.format(MusicCD.getInstance().getAfterTaxPrice()));
    }

    @Test
    void getTax() {
        String expected = "$1.50";
        assertEquals(expected, formatter.format(MusicCD.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}

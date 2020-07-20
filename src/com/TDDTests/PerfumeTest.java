package com.TDDTests;

import com.MyTesting.Perfume;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;


class PerfumeTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Perfume";
        String actual = Perfume.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        String expected = "$18.99";
        assertEquals(expected, formatter.format(Perfume.getInstance().getOriginalPrice()));
    }

    @Test
    void getAfterTaxPrice() {
        String expected = "$20.89";
        assertEquals(expected, formatter.format(Perfume.getInstance().getAfterTaxPrice()));
    }

    @Test
    void getTax() {
        String expected = "$1.90";
        assertEquals(expected, formatter.format(Perfume.getInstance().getTAX()));
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
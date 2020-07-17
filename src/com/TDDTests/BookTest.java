package com.TDDTests;

import com.MyTesting.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BookTest {

    @BeforeEach
    void setUp() {
        System.out.println("Print before each test.");
    }

    @Test
    void getName() {
        String expected = "Book";
        String actual = Book.getInstance().getNAME();
        assertEquals(expected, actual);
    }

    @Test
    void getOriginalPrice() {
        double expected = 12.49;
        double actual = Book.getInstance().originalPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getAfterTaxPrice() {
        double expected = 12.49;
        double actual = Book.getInstance().getPRICE();
        assertEquals(expected, actual);
    }

    @Test
    void getTax() {
        double expected = 0;
        double actual = Book.getInstance().getTAX();
        assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("print after each test.");
    }
}
package com.TDDTests;

import com.MyTesting.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class TPrintAllItemsTest {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @BeforeEach
    void setUp() {
        System.out.println("print before each.");
    }
    @Test
    void getInstance() {
        TPrintAllItems expected = TPrintAllItems.getInstance();
        assertTrue(true);
    }

    @Test
    void printAll() {
        TPrintAllItems.getInstance().printAll();
        assertTrue(true);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Print after each");
    }
}
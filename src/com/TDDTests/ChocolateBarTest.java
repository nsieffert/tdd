package com.TDDTests;

import com.MyTesting.ChocolateBar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBarTest {

        @BeforeEach
        void setUp() {
            System.out.println("Print before each test.");
        }

        @Test
        void getName() {
            String actual = "Chocolate Bar";
            String expected = ChocolateBar.getInstance().getNAME();
            assertEquals(expected, actual);
        }

        @Test
        void getOriginalPrice() {
            double actual = .85;
            double expected = ChocolateBar.getInstance().getOriginalPrice();
            assertEquals(expected, actual);
        }

        @Test
        void getAfterTaxPrice() {
            double actual = .85;
            double expected = ChocolateBar.getInstance().getAfterTaxPrice();
            assertEquals(expected, actual);
        }

        @Test
        void getTax() {
            double actual = 0;
            double expected = ChocolateBar.getInstance().getTAX();
            assertEquals(expected, actual);
        }

        @AfterEach
        void tearDown() {
            System.out.println("print after each test.");
        }
    }

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(4, 3));
        assertEquals(-5, calc.subtract(-2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 10));
        assertEquals(-12, calc.multiply(-3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-5, calc.divide(-10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}

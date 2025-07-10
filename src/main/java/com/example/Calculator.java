package com.example;

/**
 * A simple Calculator with basic arithmetic operations.
 */
public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide two integers (throws ArithmeticException if division by zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}


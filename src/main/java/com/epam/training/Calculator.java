package com.epam.training;

/**
 * The simplest calculator ever.
 *
 * @author Jozsef_Koza
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a a number
     * @param b the other number
     * @return the result of the addition.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Divides the first argument number with the second one.
     *
     * @param a the osztandó (dividend)
     * @param b the osztó (divisor)
     * @return the hányados (quotient)
     */
    public double divide(int a, int b) {
        return a / b;
    }
}

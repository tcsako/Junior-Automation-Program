package com.epam.training.junit.exercise;

import java.util.Collections;

/**
 * A version of calculator with slightly advanced features.
 *
 * @author Jozsef_Koza
 */
public interface AdvancedCalculator {

    /**
     * Returns the sum of the argument numbers.
     *
     * @param numbers the numbers
     * @return the sum of the argument numbers or 0 if no arguments were passed
     */
    double sum(double... numbers);

    /**
     * Returns the first {@code n} number of the Fibonacci-sequence.
     *
     * @param n the length of the sequence
     * @return the Fibonacci-sequence
     * @throws IllegalArgumentException if the argument is negative
     */
    default Iterable<Integer> fibonacci(int n) {
        return Collections.emptyList();
    }

    /**
     * Returns the sum of teh first {@code n} number of Natural numbers.
     *
     * @param n the number to sum
     * @return the sum of the Natural numbers
     * @throws IllegalArgumentException if the argument is negative
     */
    int sumOfNaturals(int n);

    /**
     * Returns the value of base raised to exponent.
     *
     * @param base     the base
     * @param exponent the exponent
     * @return the value of {@code base}<sup>{@code exponent}</sup>
     */
    double power(double base, double exponent);
}

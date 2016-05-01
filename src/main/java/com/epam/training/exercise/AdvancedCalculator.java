package com.epam.training.exercise;

import java.util.Collections;

/**
 * A version of calculator with slightly advanced features.
 *
 * @author Jozsef_Koza
 */
public interface AdvancedCalculator {

    /**
     * Returns the sum of argument numbers.
     *
     * @param numbers the numbers
     * @return the sum of the argument numbers
     */
    double sum(double... numbers);

    /**
     * Returns the first {@code n} number of the Fibonacci-sequence.
     *
     * @param n the length of the sequence
     * @return the Fibonacci-sequence
     */
    default Iterable<Integer> fibonacci(int n) {
        return Collections.emptyList();
    }

    /**
     * Returns the sum of first {@code n} number of Natural numbers.
     *
     * @param n the number to sum
     * @return the sum of Natural numbers
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

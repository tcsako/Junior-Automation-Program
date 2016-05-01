package com.epam.training.exercise;

import com.google.common.base.Preconditions;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * A version of calculator with slightly advanced features.
 *
 * @author Jozsef_Koza
 */
public class AdvancedCalculator {

    /**
     * Returns the sum of argument numbers.
     *
     * @param numbers the numbers
     * @return the sum of the argument numbers
     */
    public double sum(double... numbers) {
        return DoubleStream.of(numbers).reduce(0.0, (a, b) -> a + b);
    }

    /**
     * Returns the first {@code n} number of the Fibonacci-sequence.
     *
     * @param n the length of the sequence
     * @return the Fibonacci-sequence
     */
    public Iterable<Integer> fibonacci(int n) {
        Preconditions.checkArgument(n >= 0, "Can only compute Fibonacci-sequence for non-negative numbers");
        return Stream.iterate(new FibonacciNumber(0, 1), lastNumber -> new FibonacciNumber(lastNumber.get(), lastNumber.computeNext())).limit(n)
                .map(FibonacciNumber::get).collect(Collectors.toList());
    }

    /**
     * Returns the sum of first {@code n} number of Natural numbers.
     *
     * @param n the number to sum
     * @return the sum of Natural numbers
     */
    public int sumOfNeturals(int n) {
        return n * (1 + n) / 2;
    }

    /**
     * Returns the value of base raised to exponent.
     *
     * @param base     the base
     * @param exponent the exponent
     * @return the value of {@code base}<sup>{@code exponent}</sup>
     * @see Math#pow(double, double)
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}

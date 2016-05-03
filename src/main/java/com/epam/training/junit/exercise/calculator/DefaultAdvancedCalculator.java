package com.epam.training.junit.exercise.calculator;

import com.epam.training.junit.exercise.AdvancedCalculator;
import com.google.common.base.Preconditions;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * The default implementation of {@link AdvancedCalculator}.
 *
 * @author Jozsef_Koza
 */
public class DefaultAdvancedCalculator implements AdvancedCalculator {

    @Override
    public double sum(double... numbers) {
        return DoubleStream.of(numbers).reduce(0.0, (a, b) -> a + b);
    }

    @Override
    public Iterable<Integer> fibonacci(int n) {
        Preconditions.checkArgument(n >= 0, "Can only compute Fibonacci-sequence for non-negative numbers");
        return Stream.iterate(new FibonacciNumber(0, 1), lastNumber -> new FibonacciNumber(lastNumber.get(), lastNumber.computeNext())).limit(n)
                .map(FibonacciNumber::get).collect(Collectors.toList());
    }

    @Override
    public int sumOfNaturals(int n) {
        return n * (1 + n) / 2;
    }


    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * A pair representing a Fibonacci-number with the previous number in the sequence.
     *
     * @author Jozsef_Koza
     */
    private static final class FibonacciNumber {
        private final int previous;
        private final int value;

        FibonacciNumber(int previous, int value) {
            this.previous = previous;
            this.value = value;
        }

        /**
         * Returns the value of the Fibonacci number.
         *
         * @return the value
         */
        int get() {
            return value;
        }

        /**
         * Returns the next number in the Fibonacci-sequence
         *
         * @return the next value
         */
        int computeNext() {
            return previous + value;
        }
    }
}

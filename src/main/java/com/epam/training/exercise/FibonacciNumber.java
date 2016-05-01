package com.epam.training.exercise;

/**
 * A pair representing a Fibonacci-number with the previous number in the sequence.
 *
 * @author Jozsef_Koza
 */
final class FibonacciNumber {
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
    public int get() {
        return value;
    }

    /**
     * Returns the next number in the Fibonacci-sequence
     *
     * @return the next value
     */
    public int computeNext() {
        return previous + value;
    }
}

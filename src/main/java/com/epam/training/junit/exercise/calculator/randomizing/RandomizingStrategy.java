package com.epam.training.junit.exercise.calculator.randomizing;

/**
 * Strategy for randomizing a calculator's result.
 *
 * @author Jozsef_Koza
 */
public enum RandomizingStrategy {
    MULTIPLY {
        @Override
        double apply(double n, double seed) {
            return n * seed;
        }
    },
    DIVIDE {
        @Override
        double apply(double n, double seed) {
            return n / seed;
        }
    };

    abstract double apply(double n, double seed);
}

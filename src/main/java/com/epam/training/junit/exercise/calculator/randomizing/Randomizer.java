package com.epam.training.junit.exercise.calculator.randomizing;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Applies a randomization strategy on a number with a seed coming from a configurable provider.
 *
 * @author Jozsef_Koza
 */
public final class Randomizer implements Function<Number, Number> {
    private Supplier<Number> seedGenerator = () -> 1;
    private RandomizingStrategy randomizingStrategy = RandomizingStrategy.MULTIPLY;

    @Override
    public Number apply(Number number) {
        return randomize(number);
    }

    private double randomize(Number number) {
        return randomizingStrategy.apply(number.doubleValue(), seedGenerator.get().doubleValue());
    }

    public void setRandomizingStrategy(RandomizingStrategy randomizingStrategy) {
        this.randomizingStrategy = randomizingStrategy;
    }

    public void setSeedGenerator(Supplier<Number> seedGenerator) {
        this.seedGenerator = seedGenerator;
    }
}

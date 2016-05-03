package com.epam.training.junit.exercise.calculator;

import com.epam.training.junit.exercise.AdvancedCalculator;
import com.epam.training.junit.exercise.calculator.randomizing.Randomizer;
import com.epam.training.junit.exercise.calculator.randomizing.RandomizingStrategy;
import com.google.common.collect.Lists;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * A calculator with a meaningless feature to randomly modify the underlying calculator's return values.
 *
 * @author Jozsef_Koza
 */
public class RandomizingCalculator implements AdvancedCalculator {
    private static final Random RANDOM = new Random();

    private Randomizer randomizer = new Randomizer();
    private AdvancedCalculator calculator = new DefaultAdvancedCalculator();

    public RandomizingCalculator() {
        randomizer.setSeedGenerator(() -> RANDOM.nextInt(10));
        randomizer.setRandomizingStrategy(RandomizingStrategy.DIVIDE);
    }

    @Override
    public double sum(double... numbers) {
        return randomizer.apply(calculator.sum(numbers)).doubleValue();
    }

    @Override
    public Iterable<Integer> fibonacci(int n) {
        return Lists.newArrayList(calculator.fibonacci(n)).stream().map(number -> (Integer) randomizer.apply(number))
                .collect(Collectors.toList());
    }

    @Override
    public int sumOfNaturals(int n) {
        return randomizer.apply(calculator.sumOfNaturals(n)).intValue();
    }

    @Override
    public double power(double base, double exponent) {
        return randomizer.apply(calculator.power(base, exponent)).doubleValue();
    }

    public void setCalculator(AdvancedCalculator calculator) {
        this.calculator = calculator;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }
}

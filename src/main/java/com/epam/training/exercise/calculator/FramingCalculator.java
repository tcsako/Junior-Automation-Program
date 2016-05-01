package com.epam.training.exercise.calculator;

import com.epam.training.exercise.AdvancedCalculator;
import com.epam.training.exercise.calculator.framing.Frame;
import com.google.common.collect.Lists;

import java.util.stream.Collectors;

/**
 * An {@link AdvancedCalculator} that returns results viewable through a customizable frame.
 *
 * @author Jozsef_Koza
 */
public class FramingCalculator implements AdvancedCalculator {
    private AdvancedCalculator calculator = new DefaultAdvancedCalculator();
    private Frame frame;

    @Override
    public double sum(double... numbers) {
        return getIfInFrame(calculator.sum(numbers)).doubleValue();
    }

    @Override
    public Iterable<Integer> fibonacci(int n) {
        return Lists.newArrayList(calculator.fibonacci(n)).stream().filter(number -> frame.contains(number)).collect(Collectors.toList());
    }

    @Override
    public int sumOfNaturals(int n) {
        return getIfInFrame(calculator.sumOfNaturals(n)).intValue();
    }

    @Override
    public double power(double base, double exponent) {
        return getIfInFrame(calculator.power(base, exponent)).doubleValue();
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setCalculator(AdvancedCalculator calculator) {
        this.calculator = calculator;
    }

    private Number getIfInFrame(Number n) {
        return frame.contains(n) ? n : 0;
    }
}

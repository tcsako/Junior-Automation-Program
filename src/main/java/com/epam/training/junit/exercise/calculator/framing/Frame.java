package com.epam.training.junit.exercise.calculator.framing;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * A class to frame the result of a calculation.
 *
 * @author Jozsef_Koza
 */
public final class Frame {
    private final double lowerBoundary;
    private final double upperBoundary;

    private Frame(double lowerBoundary, double upperBoundary) {
        this.lowerBoundary = lowerBoundary;
        this.upperBoundary = upperBoundary;
    }

    public static Frame of(double lowerBoundary, double upperBoundary) {
        return new Frame(lowerBoundary, upperBoundary);
    }

    public boolean contains(Number n) {
        double value = n.doubleValue();
        return value >= lowerBoundary && value <= upperBoundary;
    }

    public double getLowerBoundary() {
        return lowerBoundary;
    }

    public double getUpperBoundary() {
        return upperBoundary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Frame frame = (Frame) o;
        return Objects.equals(lowerBoundary, frame.lowerBoundary) && Objects.equals(upperBoundary, frame.upperBoundary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerBoundary, upperBoundary);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("lowerBoundary", lowerBoundary).add("upperBoundary", upperBoundary).toString();
    }
}

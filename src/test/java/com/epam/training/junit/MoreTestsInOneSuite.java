package com.epam.training.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.training.junit.DumbCalculator;

/**
 * Illustrates that a class can contain more than one test method.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class MoreTestsInOneSuite {

    private DumbCalculator dumbCalculator = new DumbCalculator();

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivisorIsZero() throws Exception {
        dumbCalculator.divide(3, 0);
    }

    @Test
    public void shouldQuotientBeEqualToDividendIfDivisorIsOne() throws Exception {
        double result = dumbCalculator.divide(4, 1);
        Assert.assertEquals(result, 4, 0.0);
    }
}

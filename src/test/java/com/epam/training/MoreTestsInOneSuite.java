package com.epam.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Illustrates that a class can contain more than one test method.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class MoreTestsInOneSuite {

    private Calculator calculator = new Calculator();

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivisorIsZero() throws Exception {
        calculator.divide(3, 0);
    }

    @Test
    public void shouldQuotientBeEqualToDividendIfDivisorIsOne() throws Exception {
        double result = calculator.divide(4, 1);
        Assert.assertEquals(result, 4, 0.0);
    }
}

package com.epam.training;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Shows some frequently used assertions in action.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class Assertions {

    private Calculator calculator = new Calculator();
    private Sleeper sleeper = new Sleeper();

    @Test
    public void shouldResultBeGreaterThanZero() throws Exception {
        Assert.assertTrue(calculator.add(0, 1) > 0);
    }

    @Test
    public void shouldResultBeNotLessOrEqualsThanZero() throws Exception {
        Assert.assertFalse(calculator.add(0, 1) <= 0);
    }

    @Test
    public void shouldObjectsBeEqualButNotSame() throws Exception {
        Wrapper first = Wrapper.of("something");
        Wrapper second = Wrapper.of("something");
        Assert.assertEquals(first, second);
        Assert.assertSame(first, second);
    }

    @Test
    public void assertNull() throws Exception {
        Wrapper myObject = null;
        Assert.assertNull(myObject);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldExpectException() throws Exception {
        calculator.divide(3, 0);
    }

    @Test(timeout = 3000, expected = IllegalStateException.class)
    public void shouldFailBeforeTimeout() throws Exception {
        sleeper.callMeMaybe(2, TimeUnit.SECONDS);
    }

    @Test(timeout = 1000, expected = IllegalStateException.class)
    public void shouldTimeoutOccur() throws Exception {
        sleeper.callMeMaybe(2, TimeUnit.SECONDS);
    }
}

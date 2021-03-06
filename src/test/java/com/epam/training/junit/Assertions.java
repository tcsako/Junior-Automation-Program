package com.epam.training.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import com.epam.training.junit.DumbCalculator;
import com.epam.training.junit.Sleeper;
import com.epam.training.junit.Wrapper;

/**
 * Shows some frequently used assertions in action.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class Assertions {

    private DumbCalculator dumbCalculator = new DumbCalculator();
    private Sleeper sleeper = new Sleeper();

    @Test
    public void shouldResultBeGreaterThanZero() throws Exception {
        Assert.assertTrue(dumbCalculator.add(0, 1) > 0);
    }

    @Test
    public void shouldResultBeNotLessOrEqualsThanZero() throws Exception {
        Assert.assertFalse(dumbCalculator.add(0, 1) <= 0);
    }

    @Test
    public void shouldObjectsBeEqualButNotSame() throws Exception {
        Wrapper<String> first = Wrapper.of("something");
        Wrapper<String> second = Wrapper.of("something");
        Assert.assertEquals(first, second);
        Assert.assertSame(first, second);
    }

    @Test
    public void assertNull() throws Exception {
        Wrapper<Object> myObject = null;
        Assert.assertNull(myObject);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldExpectException() throws Exception {
        dumbCalculator.divide(3, 0);
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

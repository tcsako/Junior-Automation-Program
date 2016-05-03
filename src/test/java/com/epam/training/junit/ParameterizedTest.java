package com.epam.training.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.epam.training.junit.DumbCalculator;

/**
 * This test shows how one can feed parameters to a JUnit test.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameter(0) //0 is optional but it's more clearer this way
    public int a; // must be public in order the injection to work
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int sum;

    private DumbCalculator dumbCalculator = new DumbCalculator();

    @Parameters
    public static Iterable<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {2, 5, 7},
                {1, 9, 10},
                {-4, -2, -6},
                {-4, -2, 0}
        });
    }

    @Test
    public void shouldAddTwoInteger() {
        Assert.assertEquals(sum, dumbCalculator.add(a, b));
    }
}

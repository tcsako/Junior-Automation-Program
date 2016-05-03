package com.epam.training.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.training.junit.DumbCalculator;

/**
 * Unit test for {@link DumbCalculator}.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class BasicJunitTest {

    private DumbCalculator dumbCalculator = new DumbCalculator();

    @Test
    public void shouldAddTwoNumber() throws Exception {
        int result = dumbCalculator.add(4, 1);
        Assert.assertEquals(5, result);
    }
}

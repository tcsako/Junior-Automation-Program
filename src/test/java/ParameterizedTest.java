import java.util.Arrays;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * .
 *
 * @author Jozsef_Koza
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameter(0) //0 is optional but it's more clearer this way
    public int a;
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int sum;

    private Calculator calculator = new Calculator();

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
        Assert.assertEquals(sum, calculator.add(a, b));
    }
}

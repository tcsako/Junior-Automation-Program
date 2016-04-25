import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * .
 *
 * @author Jozsef_Koza
 */
public class CalculatorTest2 {

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

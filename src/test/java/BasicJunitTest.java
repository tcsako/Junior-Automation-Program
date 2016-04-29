import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for {@link Calculator}.
 *
 * @author Jozsef_Koza
 */
public class BasicJunitTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldAddTwoNumber() throws Exception {
        int result = calculator.add(4, 1);
        Assert.assertEquals(5, result);
    }
}

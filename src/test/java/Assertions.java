import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.MoreObjects;

/**
 * .
 *
 * @author Jozsef_Koza
 */
public class Assertions {

    private Calculator calculator = new Calculator();

    private static void callMeMaybe(long duration, TimeUnit unit) {
        try {
            Thread.sleep(unit.toMillis(duration));
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED");
        }
        throw new IllegalStateException("Should not happen");
    }

    @Test
    public void shouldResultBeGreaterThanZero() throws Exception {
        Assert.assertTrue(calculator.add(0, 1) > 0);
    }

    @Test
    public void shouldResultBeNotLessOrEqualsThanZero() throws Exception {
        Assert.assertFalse(calculator.add(0, 1) <= 0);
    }

    @Test
    public void same() throws Exception {
        StringWrapper first = new StringWrapper("something");
        StringWrapper second = new StringWrapper("something");
        Assert.assertEquals(first, second);
        Assert.assertSame(first, second);
    }

    @Test
    public void assertNull() throws Exception {
        StringWrapper myObject = null;
        Assert.assertNull(myObject);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivisorIsZero() throws Exception {
        calculator.divide(3, 0);
    }

    @Test(timeout = 3000, expected = IllegalStateException.class)
    public void shouldFailBeforeTimeout() throws Exception {
        callMeMaybe(2, TimeUnit.SECONDS);
    }

    @Test(timeout = 1000, expected = IllegalStateException.class)
    public void shouldTimeoutOccur() throws Exception {
        callMeMaybe(2, TimeUnit.SECONDS);
    }

    private static final class StringWrapper {
        private final String wrapped;

        private StringWrapper(String wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public int hashCode() {
            return Objects.hash(wrapped);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            StringWrapper stringWrapper = (StringWrapper) o;
            return Objects.equals(wrapped, stringWrapper.wrapped);
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this).add("wrapped", wrapped).toString();
        }
    }
}

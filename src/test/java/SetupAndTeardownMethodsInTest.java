import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .
 *
 * @author Jozsef_Koza
 */
public class SetupAndTeardownMethodsInTest {
    private static final Logger LOG = LoggerFactory.getLogger(SetupAndTeardownMethodsInTest.class);

    private Calculator calculator = new Calculator();
    private int sum = 0;

    @BeforeClass
    public static void setUpClass() {
        log("Called setUpClass");
        //TODO e.g. start selenium server
    }

    @AfterClass
    public static void tearDownClass() {
        log("Called tearDownClass");
        // TODO kill selenium server
    }

    private static void log(String msg) {
        LOG.info(msg);
    }

    @Before
    public void setUp() {
        increment(2);
    }

    @Test
    public void shouldTestSomething() throws Exception {
        increment(3);
    }

    @Test
    public void shouldTestSomethingElse() throws Exception {
        increment(3);
    }

    @After
    public void tearDown() {

    }

    private void increment(int n) {
        sum = calculator.add(sum, n);
        LOG.info("Sum: {}", sum);
    }
}

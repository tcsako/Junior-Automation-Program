package com.epam.training;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Illustrates the execution order of JUnit Before*, After* and Test methods.
 *
 * @author Jozsef_Koza
 * @author Gabor_Nemeth1
 */
public class SetupAndTeardownMethodsInTest {
    private static final Logger LOG = LoggerFactory.getLogger(SetupAndTeardownMethodsInTest.class);

    @BeforeClass
    public static void setUpClass() {
        LOG.info("Called setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        LOG.info("Called tearDownClass");
    }

    @Before
    public void setUp() {
        LOG.info("{} called setUp", this);
    }

    @After
    public void tearDown() {
        LOG.info("{} called tearDown", this);
    }

    @Test
    public void shouldTestSomething() throws Exception {
        LOG.info("{} called shouldTestSomething", this);
    }

    @Test
    public void shouldTestSomethingElse() throws Exception {
        LOG.info("{} called shouldTestSomethingElse", this);
    }
}

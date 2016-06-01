package com.epam.training.junit.exercise;

import com.epam.training.junit.exercise.calculator.DefaultAdvancedCalculator;

/**
 * Unit test for {@link com.epam.training.junit.exercise.calculator.DefaultAdvancedCalculator}.
 *
 * @author Jozsef_Koza
 */
public class DefaultCalculatorTest {

    private AdvancedCalculator calculator = new DefaultAdvancedCalculator();

    // Exercise #1:
    // Create a test method that validates if the sum() method of the calculator returns 0.0 if there weren't any parameters passed.

    // Exercise #2:
    // Create a test method that validates if the sum() method of the calculator returns correct value for some input numbers passed. How much argument number is passed, is
    // totally up to you.

    // Exercise #3:
    // Create a test method that validates the sumOfNaturals() method. Test if the argument n == 6, the returned value will be correct.

    // Exercise #4:
    // Create a test method that validates the sumOfNaturals() method. Check that the method does not accepts negative integer as input argument. In that case it should throw an
    // java.lang.IllegalArgumentException.
    // DO NOT FORGET: tests are to validate correctness of some business logic, so you can easily face bugs arise. ;-)

    // Exercise #5:
    // Create a test method that validates the fibonacci() method. Pass a positive number and check the returned sequence contains the relevant numbers in order.

    // Exercise #6:
    // Create a test method that validates the fibonacci() method. We are expecting an exception if a negative number is passed.

    // Exercise #7:
    // Create test methods which will cover all the functionality of power() method.

    // Exercise #8:
    // Create another test class (e.g. FramingCalculatorTest) that will test the FramingCalculator class. Any FramingCalculator related tests will be implemented here.
    // FramingCalculator is customizable with a Frame (an external dependency). You can test FramingCalculator with its default Frame configuration but we want to configure it
    // ourselves in the test. Set a frame with lower boundary of 10 and upper boundary of 20 in the tested FramingCalculator instance. Remember, we intend to use the same
    // configuration in each of our forthcoming test methods.
    // Check that passing 20 to sumOfNaturals() will return 0!

    // Exercise #9:
    // Create a test method in FramingCalculatorTest which tests that fibonacci() will return just the numbers belonging to the defined frame.

    // Exercise #10:
    // Create test methods into FramingCalculatorTest to cover all the remaining functionality.

    // Optional Exercise #1:
    // In each test, implement the exact same validations calling assertThat() with proper Matchers.

    // Optional Exercise #1:
    // Write any test you like for com.epam.training.junit.exercise.calculator.RandomizingCalculator
}

package com.epam.training.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * A simple matcher matching the Answer to the Ultimate Question of Life, The Universe, and Everything.
 *
 * @author Jozsef_Koza
 */
public class TheAnswerMatcher extends BaseMatcher<Object> {
    private static final Integer THE_ANSWER = 42;

    private TheAnswerMatcher() {
    }


    public static Matcher<Object> theAnswer() {
        return new TheAnswerMatcher();
    }

    @Override
    public boolean matches(Object o) {
        return THE_ANSWER.equals(o);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("'The answer to the Ultimate Question of Life, The Universe, and Everything' to be ").appendValue(THE_ANSWER);
    }
}

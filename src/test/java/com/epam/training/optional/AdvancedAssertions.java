package com.epam.training.optional;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Collection;

import static com.epam.training.matcher.TheAnswerMatcher.theAnswer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * This class show the power of Hamcrest matchers.
 *
 * @author Jozsef_Koza
 */
public class AdvancedAssertions {
    private static final ImmutableMap<String, String> A_TEST_MAP = ImmutableMap.of("aKey", "aValue", "anotherKey", "anotherValue");

    @Test
    public void simpleMatcher() {
        assertThat("aString", equalTo("anotherString"));
    }

    @Test
    public void matchersOnNumbers() {
        assertThat(42, lessThan(Integer.MAX_VALUE));
        assertThat(42, greaterThan(Integer.MIN_VALUE));
    }


    @Test
    public void collectionMatchers() {
        assertThat(A_TEST_MAP, hasEntry("aKey", "aValue"));
        assertThat(A_TEST_MAP, hasKey("aKey"));
        assertThat(A_TEST_MAP, hasValue("aValue"));

        Collection<String> testValues = A_TEST_MAP.values();
        assertThat(testValues, contains("aValue", "anotherValue"));
        assertThat(testValues, containsInAnyOrder("anotherValue", "aValue"));
        assertThat(testValues, hasItem("aValue"));
    }


    @Test
    public void combiningMatchers() {
        assertThat(A_TEST_MAP, allOf(hasEntry("aKey", "aValue"), not(hasValue(matchesPattern("\\d+"))), hasKey(anyOf(equalToIgnoringCase
                ("ANOtherkey"), equalToIgnoringWhiteSpace("aNonExistentKez  ")))));
        assertThat(A_TEST_MAP.values(), hasItem("anotherValue"));
    }

    @Test
    public void customMatchers() {
        assertThat(40, is(theAnswer()));
    }
}

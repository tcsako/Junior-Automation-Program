package com.epam.training;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * A simple wrapper.
 *
 * @param <T> the type of wrapped object
 * @author Jozsef_Koza
 */
public final class Wrapper<T> {
    private final T value;

    private Wrapper(T value) {
        this.value = value;
    }

    public static <T> Wrapper<T> of(T value) {
        return new Wrapper<>(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wrapper wrapper = (Wrapper) o;
        return Objects.equals(value, wrapper.value);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("value", value).toString();
    }
}

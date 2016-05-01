package com.epam.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * This class provides sleeping functionality.
 *
 * @author Jozsef_Koza
 */
public class Sleeper {
    private static final Logger LOG = LoggerFactory.getLogger(Sleeper.class);

    /**
     * Stops the current thread for the argument duration.
     *
     * @param duration the amount of time to wait
     * @param unit     the unit of the time to wait
     */
    public void callMeMaybe(long duration, TimeUnit unit) {
        try {
            Thread.sleep(unit.toMillis(duration));
        } catch (InterruptedException e) {
            LOG.error("INTERRUPTED");
        }
        throw new IllegalStateException("Should not happen");
    }
}

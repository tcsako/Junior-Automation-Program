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

    public void callMeMaybe(long duration, TimeUnit unit) {
        try {
            Thread.sleep(unit.toMillis(duration));
        } catch (InterruptedException e) {
            LOG.error("INTERRUPTED");
        }
        throw new IllegalStateException("Should not happen");
    }
}

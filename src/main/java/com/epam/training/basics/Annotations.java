package com.epam.training.basics;

/**
 * This class contains examples regarding annotations.
 *
 * @author Zsolt_Horvath1
 */
public class Annotations {

    /**
     * @deprecated Prints the specified message.
     *
     * @param message the message to be print
     */
    @Deprecated
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "@Override annotation informs the compiler that the element is "
                + "meant to override an element declared in a superclass.";
    }

}

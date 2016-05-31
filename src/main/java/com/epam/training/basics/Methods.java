package com.epam.training.basics;

/**
 * This class contains Java methods related example(s).
 *
 * @author Zsolt_Horvath1
 */
public class Methods {

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is " + sum(2, 3));
    }

    /**
     * Provides the sum of the specified two numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum
     */
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

}

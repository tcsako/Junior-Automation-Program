package com.epam.training.basics;

/**
 * Examples regarding conditional statements.
 * 
 * @author Zsolt_Horvath1
 */
public class ConditionalStatements {

    public static void main(String[] args) {
        boolean condition = true;
        int number = 9;

        // Standard 'if-then' statement (without 'else')
        if (condition) {
            System.out.println("Condition is true");
        }

        // Standard 'if-then-else' statement
        if (!condition) {
            System.out.println("Negation of the condition is true");
        } else {
            System.out.println("Negation of the condition is false");
        }

        // Another 'if-then-else' statement with 'else if'
        if (number % 2 == 0) {
            System.out.println(number + " could be divided by 2");
        } else if (number % 3 == 0) {
            System.out.println(number + " could be divided by 3");
        } else if (number % 4 == 0) {
            System.out.println(number + " could be divided by 4");
        } else {
            System.out.println("Let's drink a beer!");
        }
    }

}

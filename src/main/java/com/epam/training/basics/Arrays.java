package com.epam.training.basics;

/**
 * Example class to see how arrays work.
 *
 * @author Zsolt_Horvath1
 */
public class Arrays {

    public static void main(String[] args) {
        // Array initialization
        String[] fruits = { "apple", "orange", "lemon" };

        // Another way to initialize an array
        String[] vegetables = new String[3];
        vegetables[0] = "potato";
        vegetables[1] = "pumpkin";
        vegetables[2] = "cucumber";

        // Print values of an array with the foreach loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}

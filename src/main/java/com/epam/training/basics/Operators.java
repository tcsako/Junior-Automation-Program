package com.epam.training.basics;

/**
 * Class to show how operators work in Java.
 * 
 * @author Zsolt_Horvath1
 */
public class Operators {

    public static void main(String[] args) {
        int x;

        // Assignment
        x = 9;
        System.out.println("x is " + x);

        // Addition
        System.out.println("x + 3 = " + (x + 3));

        // Subtraction
        System.out.println("x - 3 = " + (x - 3));

        // Multiplication
        System.out.println("x * 3 = " + (x * 3));

        // Division
        System.out.println("x / 3 = " + (x / 3));

        // Modulus
        System.out.println("x % 3 = " + (x % 3));

        // Assignment by addition
        x += 3;
        System.out.println("x is " + x);

        // Assignment by subtraction
        x -= 3;
        System.out.println("x is " + x);

        // Assignment by multiplication
        x *= 3;
        System.out.println("x is " + x);

        // Assignment by division
        x /= 3;
        System.out.println("x is " + x);

        // Assignment by modulo division
        x %= 3;
        System.out.println("x is " + x);

        // Equal to
        System.out.println("x == 0 is " + (x == 0));

        // Not equal to
        System.out.println("x != 0 is " + (x != 0));

        // Less than
        System.out.println("x < 10 is " + (x < 10));

        // Greater than
        System.out.println("x > 10 is " + (x > 10));

        // Less than or equal
        System.out.println("x <= 0 is " + (x <= 0));

        // Greater than or equal
        System.out.println("x >= 0 is " + (x >= 0));

        // Or
        System.out.println("false or true is " + (false || true));

        // And
        System.out.println("true and false is " + (true && false));

        // Not
        System.out.println("not true is " + !true);
    }

}

package com.epam.training.basics;

/**
 * This class contains examples regarding 'for' and 'while' loops.
 * 
 * @author Zsolt_Horvath1
 */
public class IteratonStatements {

    public static void main(String[] args) {
        // for-loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Line #" + (i + 1) + " with for-loop");
        }

        // while-loop
        int i = 0;
        while (i < 5) {
            System.out.println("Line #" + (i + 1) + " with while-loop");
            i += 1;
        }
    }

}

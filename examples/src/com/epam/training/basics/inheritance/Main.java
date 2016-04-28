package com.epam.training.basics.inheritance;

/**
 * The executable class to present inheritance.
 * 
 * @author Zsolt_Horvath1
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Let's create a boxer:");
        Boxer dog1 = new Boxer();
        System.out.println("The boxer says:");
        dog1.bark();

        System.out.println("...then create another dog, a buldog:");
        Buldog dog2 = new Buldog();
        System.out.println("The buldog says:");
        dog2.bark();

        System.out.println("And now a black cat:");
        Cat cat = new Cat();
        cat.setColor("black");
        System.out.println("The " + cat.getColor() + " cat says:");
        cat.meow();

        System.out.println("Finally let's create a bear:");
        Bear bear = new Bear();
        System.out.println("The bear says:");
        bear.growl();
        System.out.println("Let's see what happens if we try to get the color of the bear: " + bear.getColor());
    }

}

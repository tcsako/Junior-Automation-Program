package com.epam.training.basics.inheritance;

/**
 * Class to represent an animal.
 * 
 * @author Zsolt_Horvath1
 */
public class Animal {

    private String color;

    public Animal() {
        System.out.println("- New animal is created.");
    }

    /**
     * Provides the color of the animal.
     *
     * @return the color of the animal
     */
    public String getColor() {
        if (color != null) {
            return color;
        } else {
            return "Color of the animal is unknown.";
        }
    }

    /**
     * Sets the color of the animal.
     *
     * @param color the color to be set
     */
    public void setColor(String color) {
        this.color = color;
    }

}

package com.epam.training.examples.inheritance;

public class Animal {

    private String color;

    public Animal() {
        System.out.println("- New animal is created.");
    }

    public String getColor() {
        if (color != null) {
            return color;
        } else {
            return "Color of the animal is unknown.";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

}

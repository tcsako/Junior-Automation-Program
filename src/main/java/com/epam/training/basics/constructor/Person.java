package com.epam.training.basics.constructor;

public class Person {

    private String firstName;
    private String lastName;

    /**
     * Constructor that sets the first and last name of the person.
     *
     * @param f the first name to be set
     * @param l the last name to be set
     */
    public Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person p = new Person("Emily", "Smith");
        System.out.println("The name of the person is " + p);
    }

}

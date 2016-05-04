package com.epam.training.basics;

public class Strings {

    public static void main(String[] args) {
        // String concatenation
        String companyType = "Kft";
        String concatenatedName = "EPAM " + "Systems " + companyType;

        // String comparison with method 'equals'
        if ("EPAM Systems Kft".equals(concatenatedName)) {
            System.out.println("The value of the 'concatenatedName' variable is 'EPAM Systems Kft'");
        }

        // Transform string to upper case
        String upperCaseVersion = concatenatedName.toUpperCase();
        System.out.println("Upper case version is '" + upperCaseVersion + "'");

        // Transform string to lower case
        String lowerCaseVersion = concatenatedName.toLowerCase();
        System.out.println("Lower case version is '" + lowerCaseVersion + "'");

        // Usage of the string builder
        StringBuilder myStringBuilder = new StringBuilder("This is a string builder with lot of modifications");
        for (int i = 0; i < 10; i++) {
            myStringBuilder.append(".");
        }

        // Call the 'toString' method in order to print its content
        System.out.println(myStringBuilder.toString());
    }

}

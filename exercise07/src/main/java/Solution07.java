/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

// prompt user What is the length of the room in feet?
// get input and store as int
// prompt user What is the width of the room in feet?
// get input and store as int
// repeat their inputs back to them
// Calculate area by multiplying the 2 values together
// return area as type int
// multiply area value by conversion constant to get area in square meters
// return area in square meters

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double sqft2sqm = 0.09290304;

        System.out.println("What is the length of the room? ");
        double lengthDouble = scanner.nextInt();
        int length = (int)lengthDouble;

        System.out.println("What is the width of the room? ");
        double widthDouble = scanner.nextInt();
        int width = (int)widthDouble;

        int areaFeetInt = length * width;
        double areaFeetDouble = lengthDouble * widthDouble;
        double areaSquareMeter = areaFeetDouble * sqft2sqm;

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is:");
        System.out.println(areaFeetInt + " square feet");
        System.out.println(areaSquareMeter + " square meters");

    }
}

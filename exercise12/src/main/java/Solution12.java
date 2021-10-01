/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user: "Enter the principal:","Enter the rate of interest:","Enter the number of years:"
store principal, interest rate PERCENTAGE, as double
store years as int since we are using annual interest formula
divide interest rate by 100 to convert from percentage to double
use formula A = P(1 + rt)
round up A to nearest cent
output "After # years at #.#%, the investment will be worth $#."
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // inputs
        System.out.println("Enter the principal:");
        float P = scanner.nextFloat();
        System.out.println("Enter the interest rate %:");
        float r = scanner.nextFloat();
        System.out.println("Enter the number of years:");
        int t = scanner.nextInt();

        // calculations
        double rate = r/100.0; // converting from percentage to decimal
        double A = P * (1 + rate * t);
        double acc = Math.ceil(A * 100.0)/100.0; // rounding up to 2 decimal places (nearest cent)

        // output
        System.out.println("After " +t+ " years at " +r+ "%, the investment will be worth $" +acc);
    }
}

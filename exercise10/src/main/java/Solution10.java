/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user: "Price of item 1,2,3:" , "Quantity of item 1,2,3:"
store prices of items as floats, quantities as ints
create a double constant taxRate of 5.5%
multiply prices of items with corresponding quantities - store as double
sum up total cost as double - store as subtotal
multiply the tax rate with the subtotal to calculate total
print out subtotal, tax, and total
 */

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        // constant & scanner
        Scanner s = new Scanner(System.in);
        final double taxRate = 0.055;

        // inputs
        System.out.println("Enter the price of item 1:");
        float price1 = s.nextFloat();
        System.out.println("Enter the quantity of item 1:");
        int quant1 = s.nextInt();
        System.out.println("Enter the price of item 2:");
        float price2 = s.nextFloat();
        System.out.println("Enter the quantity of item 2:");
        int quant2 = s.nextInt();
        System.out.println("Enter the price of item 3:");
        float price3 = s.nextFloat();
        System.out.println("Enter the quantity of item 3:");
        int quant3 = s.nextInt();

        // calculations
        double subtotal = (price1*quant1) + (price2*quant2) + (price3*quant3);
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        // outputs
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}

/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user their order amount and what state they are in
if the user is in Wisconsin then a 5.5% tax will be added to their subtotal
if the user is not in Wisconsin, then return subtotal
round up final total to the nearest cent
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        // scanner & constants
        Scanner scanner = new Scanner(System.in);
        final double taxRate = 0.055;

        // inputs
        System.out.println("What is the order amount?");
        double amount = scanner.nextDouble();
        System.out.println("What is the state?");
        String state = new String(scanner.next());

        // calculations & logic
        if (state.equals("WI")){
            double subtotal = amount; // making subtotal the entered amount from user
            double tax = subtotal * taxRate;
            double Tax = Math.round(tax * 100.0)/100.0; // rounding to nearest cent
            amount = Tax + subtotal; // applying the tax to users in Wisconsin
            System.out.println("The subtotal is $" +subtotal+ ".\nThe tax is $" +Tax);
        }
        double Amount = Math.ceil(amount * 100.0)/100.0; // rounding to nearest cent

        // output for both Wisconsin and out of state users
        System.out.println("The total is $" +Amount);
    }
}

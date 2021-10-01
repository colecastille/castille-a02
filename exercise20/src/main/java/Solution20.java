/*
UCF COP3330 Fall 2021 Assignment 20 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user their order amount, what state and what county they live in
store order amount as type double
store state and county as type string
if user is resident of Wisconsin -> 5% sales tax
if user is from Illinois -> 8% sales tax
if user is from Eau Claire county -> additional 0.5% tax
if user is from Dunn county -> additional 0.4% tax
if user is from other state -> output order amount
 */

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {

        // scanner and constants
        Scanner scanner = new Scanner(System.in);
        final double wisconsinTax = 0.05;
        final double illinoisTax = 0.08;
        final double eauTax = 0.005;
        final double dunnTax = 0.004;

        // prompts and inputs
        System.out.println("What is the order amount?");
        double amount = scanner.nextDouble();
        System.out.println("What state do you live in?");
        String state = new String(scanner.next());

        // math and logic
        if (state.equals("Wisconsin")){
            System.out.println("What county do you live in?");
            String county = new String(scanner.next());
            double tax = amount * wisconsinTax;
            double Total = amount + tax;
            double newTotal = Math.round(Total * 100.0)/100.0;

            if(county.equals("Eau Claire")){
                double Eausummedtax = wisconsinTax + eauTax;
                double newTax = amount * Eausummedtax;
                double roundTax = Math.ceil(newTax * 100.0)/100.0;
                double total = amount + newTax;
                double roundTotal = Math.ceil(total * 100.0)/100.0;
                System.out.println("The tax is $"+roundTax);
                System.out.println("The total is $"+roundTotal);
            }else if (county.equals("Dunn")){
                double Dunnsummedtax = wisconsinTax + dunnTax;
                double newTax = amount * Dunnsummedtax;
                double roundTax = Math.ceil(newTax * 100.0)/100.0;
                double total = amount + newTax;
                double roundTotal = Math.ceil(total * 100.0)/100.0;
                System.out.println("The tax is $"+roundTax);
                System.out.println("The total is $"+roundTotal);
            } else {
                System.out.println("The tax is $"+tax);
                System.out.println("The total is $"+newTotal);
            }
        } else if (state.equals("Illinois")){
            double tax = amount * illinoisTax;
            double roundTax = Math.ceil(tax * 100.0)/100.0;
            double total = tax + amount;
            double roundTotal = Math.ceil(total * 100.0)/100.0;
            System.out.println("The tax is $"+roundTax);
            System.out.println("The amount is $"+roundTotal);
        } else {
            System.out.println("The total is $"+amount);
        }

    }
}
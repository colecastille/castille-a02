/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user principal amount, annual rate of interest as percentage, # of years amount is invested
    number of times interest is compounded per year
store principal and interest rate as doubles
store years and number compounded as ints
Use formula for compound interest [ A = P(1 + r/n)^(n*t) ]
round up A to the nearest cent
output principal investment, interest rate %, years invested, number of times compounded yearly, and
    final value of investment
 */

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // inputs
        System.out.println("What is the principal amount?");
        double p = scanner.nextDouble();
        System.out.println("What is the interest rate %?");
        double r = scanner.nextDouble();
        System.out.println("What is the number of years?");
        int t = scanner.nextInt();
        System.out.println("What is the number of times the investment is compounded per year?");
        int n = scanner.nextInt();

        // calculations
        double R = r/100; // converting percentage to decimal
        double a = p * Math.pow((1 + R / n),n * t); // a = p(1 + R/n)^(n*t)
        double A = Math.ceil(a * 100.0)/100.0; // rounding up 2 decimal places or nearest cent

        // output
        System.out.println("$" +p+ " invested at " +r+ "% for " +t+ " years compounded " +n+ " times per year is $" +A);
    }
}

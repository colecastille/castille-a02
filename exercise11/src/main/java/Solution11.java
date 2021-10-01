/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user "How many euros are you exchanging?","What is the exchange rate?"
scan in euro quantity as int, exchange rate as double
multiply euros and exchange rate
store conversion to dollars as double
round up decimal to nearest cent
output "# euros at an exchange rate of #.# is #.# U.S. dollars."
 */

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        // scanner
        Scanner s = new Scanner(System.in);

        // input
        System.out.println("How many euros are you exchanging?");
        int euros = s.nextInt();
        System.out.println("What is the exchange rate?");
        double exRate = s.nextDouble();

        // calculations
        double conv = euros * exRate;
        double USdollar = Math.ceil(conv * 100.0)/100.0;

        // output
        System.out.println(euros+" euros at an exchange rate of " +exRate+ " is " +USdollar+ " U.S. dollars");
    }
}

/*
UCF COP3330 Fall 2021 Assignment 22 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user 3 numbers
store as type int
compare the first two values, store largest into a variable
compare the new variable with the third value, store largest of those two in another variable
output the largest integer with that variable
 */

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        // prompts and inputs
        System.out.println("Enter the first integer:");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int n2 = scanner.nextInt();
        System.out.println("Enter the third integer:");
        int n3 = scanner.nextInt();

        // check and cases
        if (n1 == n2 && n2 == n3) {
            System.out.println("Please enter differing integers.");
            System.exit(0);
        }
        int thisLarger = (n1 > n2) ? n1 : n2;
        int thatLarger = (thisLarger > n3) ? thisLarger : n3;

        // output
        System.out.println("The largest number is "+thatLarger);
    }
}

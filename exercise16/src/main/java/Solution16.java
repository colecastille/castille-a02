/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user "What is your age?"
store age as int
compare age to legal driving age constant
if age >= legal age is true, return "You are old enough to drive"
if false, then return "You are not old enough to drive"
 */

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        // scanner and constant
        Scanner scanner = new Scanner(System.in);
        final int legalAge = 16;

        // prompt and input
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        // logic
        String isLegal = "You are old enough to drive";
        String isNotLegal = "You are not old enough to drive";
        String statement = (age >= legalAge) ? isLegal : isNotLegal;

        // output
        System.out.println(statement);
    }
}

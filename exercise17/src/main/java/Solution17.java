/*
UCF COP3330 Fall 2021 Assignment 17 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user if they are a male (M) or female (F)
store gender as string
prompt how many ounces of alcohol they had
store drink as double
prompt user how much they weigh in pounds
store weight as double
prompt how many hours it has been since their last drink
store hours as double
use formuala BAC = (A * 5.14 / W * r) - 0.015 * H
    where   A = alcohol consumed (ounces)
            W = weight (lbs)
            r = distribution ration
                0.73 for M
                0.66 for F
            H = hours since last drink
compare BAC to legalBAC constant and determine if it is safe to drive
 */

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {

        // scanner & constants
        Scanner scanner = new Scanner(System.in);
        final double legalBAC = 0.08;
        double mRatio = 0.73;
        double fRatio = 0.66;

        // prompts & inputs
        System.out.println("Enter 1 if you are a male or a 2 if you are a female.");
        int gender =  scanner.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        double drink = scanner.nextDouble();
        System.out.println("What is you weight in pounds?");
        double weight = scanner.nextDouble();
        System.out.println("How many hours has it been since your last drink?");
        double hours = scanner.nextDouble();

        // math & logic
        double r = (gender == 1) ? mRatio : fRatio; // if user entered a 1, use male ratio. if false use female ratio
        double BAC = (drink * 5.14 / weight * r) - .015 * hours; // BAC formula
        String driveCheck = (BAC <= legalBAC) ? "It is legal for you to drive" : "It is not legal for you to drive";
        // if users BAC <= legal BAC then it is legal for them to drive. If false, then it is illegal

        // output
        System.out.println("Your BAC is " +BAC);
        System.out.println(driveCheck);
    }
}

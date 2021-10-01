/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

// Prompt user: What is your current age?
// Get age as type int
// store int
// Prompt: At what age would you like retire?
// Get age they would like to retire and store as int
// Calculate amount of years till the person retires
// Get current year and add the difference between the current age and retirement age to get expected retirement year

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Solution06 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        // prompt and store current age
        System.out.println("What is your current age?");
        int currentAge = s1.nextInt();

        // prompt and store desired retirement age
        System.out.println("At what age would you like to retire?");
        int retireAge = s1.nextInt();

        // math
        int diff = retireAge - currentAge;
        int currentYear = calendar.get(Calendar.YEAR);
        int retirementYear = currentYear + diff;

        // output
        System.out.println("You have " + diff + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear);
    }
}

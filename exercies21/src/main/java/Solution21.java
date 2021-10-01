/*
UCF COP3330 Fall 2021 Assignment 20 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user to enter the number of the month
store input as type int
compare int value to corresponding case to get month
if int is not a case, default for user to enter a value within the range of 1-12
 */

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);

        // prompt and input
        System.out.println("Please enter the number of the month:");
        int month = scanner.nextInt();

        // cases and outputs
        String enteredMonth = "";
        switch (month){
            case 1: enteredMonth = "January";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 2: enteredMonth = "February";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 3: enteredMonth = "March";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 4: enteredMonth = "April";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 5: enteredMonth = "May";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 6: enteredMonth = "June";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 7: enteredMonth = "July";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 8: enteredMonth = "August";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 9: enteredMonth = "September";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 10: enteredMonth = "October";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 11: enteredMonth = "November";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            case 12: enteredMonth = "December";
                System.out.println("The name of the month is "+enteredMonth);
                break;
            default:
                System.out.println("Please enter an integer from 1-12");
                break;
        }
    }
}

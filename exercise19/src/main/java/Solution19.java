/*
UCF COP3330 Fall 2021 Assignment 19 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user their height and weight
store both values as doubles
calculate BMI = (weight / (height * height)) * 703
if BMI is less than 18.5 tell user they are underweight and should see a doctor
if BMI is more than 32.5 tell user they are overweight and should see a doctor
if BMI is within 18.5 and 32.5 tell user theyre within the ideal weight range
 */

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // inputs
        System.out.println("What is your height?");
        double height = scanner.nextDouble();
        System.out.println("What is your weight?");
        double weight = scanner.nextDouble();

        // math
        double BMI = (weight / (height * height)) * 703;

        // constraints
        if ((height <= 0) || (weight <= 0)){ // a user has to enter a correct value
            System.out.println("Please enter a correct value.");
            return;
        }else if(BMI < 18.5){
            System.out.println("Your BMI is "+BMI);
            System.out.println("You are underweight. You should see a doctor.");
        }else if (BMI > 25){
            System.out.println("Your BMI is "+BMI);
            System.out.println("You are overweight. You should see a doctor.");
        }else{
            System.out.println("Your BMI is "+BMI);
            System.out.println("You are within the ideal weight range.");
        }
    }
}

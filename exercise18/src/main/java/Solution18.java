/*
UCF COP3330 Fall 2021 Assignment 18 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user C if they want to convert from fahrenheit to celsius
prompt user F if they want to convert from celsius to fahrenheit
print what their choice is and accept F,f,C,c as valid inputs
equations   C = (F - 32) * 5/9
            F = (C * 5/9) + 32
prompt user the temperature in either fahrenheit or celsius
plug in values to correct equation
output converted temperature
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);

        // prompts and inputs
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice:");
        String choice = new String(scanner.next());

        // math, logic and outputs
        if (choice.equals("C") || choice.equals("c")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            double tempEnt = scanner.nextDouble();
            double C = (tempEnt - 32) * 5/9;
            System.out.println("The temperature in Celsius is " +C);
        }else if (choice.equals("F") || choice.equals("f")){
            System.out.println("Please enter the temperature in Celsius:");
            double tempEnt = scanner.nextDouble();
            double F = (tempEnt * 9/5) + 32;
            System.out.println("The temperature in Celsius is " +F);
        }else{
            System.out.println("Please enter either C,c,F,or f.");
        }
        }
    }

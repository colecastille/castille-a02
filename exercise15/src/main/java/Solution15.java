/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt user "What is the password?"
store input as string
compare strings to set password
if user enters correct password then output "Welcome!"
else, output "I don't know you"
 */

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        // scanner and password
        Scanner scanner =  new Scanner(System.in);
        final String password = "abc$123";

        // prompts & inputs
        System.out.println("What is the password?");
        String input = new String(scanner.next());

        // output w/ logic
        if (input.equals(password)){
            System.out.println("Welcome!");
        }else {
            System.out.println("I don't know you.");
        }
    }
}

/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

// prompt user How many people?
// store input as int
// prompt How many pizzas do you have?
// store input as int
// prompt How many slices per pizza?
// store input as int
// multiply num of slices and num of pizzas
// output # people with # pizzas (# total slices)
// divide total slices by num of people
// store as int
// output Each person gets # pieces of pizza
// store total slices MOD num of people as int
// output There are # leftover pieces

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts
        System.out.println("How many people?");
        int people = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = scanner.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = scanner.nextInt();

        //math
        int totalSlices = pizzas * slices;
        int slicesPerPerson = totalSlices / people;
        int leftover = totalSlices % people;

        //outputs
        System.out.println(people+" people with "+pizzas+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+slicesPerPerson+" pieces of pizza.");
        System.out.println("There are "+leftover+" leftover pieces");
    }
}

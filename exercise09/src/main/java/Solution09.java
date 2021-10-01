/*
UCF COP3330 Fall 2021 Assignment 6 Solution
Copyright 2021 Cole Castille
 */

/*
prompt "What is length of room?","What is width of room?"
store length and width as int
multiply length and width to get area as double
make paintAreaConstant constant (type int)
make purchaseGallons as type double
convert area and purchaseGallons to int
if area MOD gallonOfPaint is greater than 0 then round purchaseGallons int up to next closest int
output "You will need to purchase # gallons of paint to cover # square feet."
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        // scanner input
        Scanner scanner = new Scanner(System.in);

        // paint constant (in square feet)
        final double paintAreaConstant = 350;

        System.out.println("What is the length of the room?");
        int length = scanner.nextInt();
        System.out.println("What is the width of the room?");
        int width = scanner.nextInt();

        // math
        float area = length * width;
        double purchaseGallons = area / paintAreaConstant;

        // condition
        if (area % paintAreaConstant > 0) {
            purchaseGallons = Math.ceil(purchaseGallons);
        }else {
            return;
        }

        // converting from double to int
        int totalGallons = (int) purchaseGallons;
        int totalArea = (int) area;

        // output
        System.out.println("You will need to purchase "+totalGallons+" gallons of paint to cover "+totalArea+" square feet.");
    }
}

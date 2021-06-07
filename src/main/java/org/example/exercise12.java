/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner interest = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = interest.nextInt();

        System.out.print("Enter the rate of interest: ");
        double intRate = interest.nextDouble();
        double newintRate = intRate / 100;

        System.out.print("Enter the number of years: ");
        int years = interest.nextInt();

        double total = (principal * newintRate * years) + principal;

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.\n", years, intRate, total);

    }
}

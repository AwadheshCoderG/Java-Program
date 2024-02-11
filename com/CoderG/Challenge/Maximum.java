package com.CoderG.Challenge;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find maximum number");
        System.out.println("Please enter the first number: ");
        int numberOne = input.nextInt();
        System.out.println("Now, enter the second number: ");
        int numberTwo = input.nextInt();
        System.out.println("Maximum number is: "+ Math.max(numberOne, numberTwo));
    }
}

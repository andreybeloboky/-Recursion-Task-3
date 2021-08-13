package com.company;

import java.util.Scanner;

public class Main {
	
    // Method for Calculating Factorial
    public static int factorial(int userInput) {
        if (userInput == 0)
            return 1;
        else
            return userInput * factorial(userInput - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = FactorialCreator.calculator(i);
        System.out.println(result);
    }
}

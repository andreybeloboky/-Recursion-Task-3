package com.company;

public class Main {
	
    // Method for Calculating Factorial
    public static int factorial(int userInput) {
        if (userInput == 0)
            return 1;
        else
            return userInput * factorial(userInput - 1);
    }

    public static void main(String[] args) {
	// write your code here
    }
}

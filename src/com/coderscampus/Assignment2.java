package com.coderscampus;

import java.util.Scanner;  
import java.util.Random;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; 
        int numberOfGuesses = 0;
        
        System.out.println("Pick a number between 1 and 100");

        while (numberOfGuesses < 5) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number");
                scanner.next(); 
                continue;
            }
            
            int guess = scanner.nextInt();
            
            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
            }
            
            numberOfGuesses++;
            
            if (guess < randomNumber) {
                System.out.println("Please pick a higher number");
            } else if (guess > randomNumber) {
                System.out.println("Please pick a lower number");
            } else {
                System.out.println("You win!");
                return;
            }
        }

        if (numberOfGuesses == 5) {
            System.out.println("You lose, the number to guess was " + randomNumber);
        }else {
            scanner.close();
        }
     }
}

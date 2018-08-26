package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int random = (int )(Math.random() * 100 + 1);
        System.out.println("Try to guess the secret number!");
        //gets the random number



        while(true){

            int guess = 0;
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            //user inputs guess


            if (guess == random) {
                System.out.println("You guessed the number!");
                System.exit(0);
            }
            else if (guess > random) {
                System.out.println("The secret number is lower than your guess!");
            }
            else {
                System.out.println("The secret number is higher than your guess!");
            }
        }
    }
}
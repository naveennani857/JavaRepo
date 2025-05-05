package com.ultron.basic_programs;

import java.util.Random;
import java.util.Scanner;

public class RandomTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(100)+1;
        System.out.println("Welcome to Number guessing context \n You will be given with a random number from 1 to 100 \n You have to guess the number, Try your luck All the Best");
        int guess = 0;
        int attempts =0;

        while (guess != x) {
            attempts++;
            System.out.println(attempts+" Attempt/s");
            guess = scanner.nextInt();
            
            if(guess < x){
                System.out.println("Guess is too low");
            }
            else if(guess > x){
                System.out.println("Guess is too high");
            } 
            else{
                System.out.println("Your guess was correct and you took "+attempts+" chances");
            }
        }
        scanner.close();
    }
}

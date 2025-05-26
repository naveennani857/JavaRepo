package com.ultron.mini_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Create a String array to store the choices
        String[] choices = {"Rock","Paper","Scissor"};  // 0, 1, 2

        //Random class for System Choices
        int sc = random.nextInt(3);
        String systemChoice = choices[sc];

        System.out.println("Enter your choice 1 : Rock || 2 : Paper || 3 : Scissor");
        int uc = scanner.nextInt();
        String userChoice = choices[uc-1];

        System.out.println("System choice : "+systemChoice+" ## Your Choice : "+userChoice);
        if(systemChoice.equals(userChoice)){
            System.out.println("Draw");
        }
        else if((systemChoice.equals("Rock") && userChoice.equals("Scissor")) || (systemChoice.equals("Scissor") && userChoice.equals("Paper")) ||(systemChoice.equals("Paper")&& userChoice.equals("Rock"))){
            System.out.println("System wins");
        }
        else {
            System.out.println("You won the game");
        }


        scanner.close();
    }
}

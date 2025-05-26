package com.ultron.mini_game;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
         Random random = new Random();
        
        for(int i = 0; i < 10;i++){
            int choice = random.nextInt(3);
            System.out.println(choice);
        }
            
    }
}

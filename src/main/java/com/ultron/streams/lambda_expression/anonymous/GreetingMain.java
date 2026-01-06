package com.ultron.streams.lambda_expression.anonymous;

public class GreetingMain {
    public static void main(String[] args) {
        String greeting = "Hi, How are you!";

        Greeting greetMessage = new Greeting() { //Anonymous inner class
            // Overriding Greeting class method
            public void greet() {
                System.out.println(greeting);
            }
        }; // Semicolom is required
        greetMessage.greet();

        // Replying rep = new Replying() {           this can't work because the class
        //     public void reply(){                     Replying is not present
        //         System.out.println("Replying");
        //     }
        // };
    }
}

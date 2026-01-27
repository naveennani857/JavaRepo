package com.ultron.streams.lambda_expression.programs;

public class StringUppercase {
    public static void main(String[] args) {
        String input = "naveen";
        StringUppercaseInterface si = (x) -> x.toUpperCase();

        System.out.println(si.stringUppercaseMethod(input));
    }
}

@FunctionalInterface
interface StringUppercaseInterface {
    String stringUppercaseMethod(String a);
}

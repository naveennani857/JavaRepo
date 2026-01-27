package com.ultron.streams.lambda_expression.programs;

import java.util.function.BiConsumer;

public class Add2Numbers {
    public static void main(String[] args) {
        int a = 2;
        double b = 5.8;

        // Using custom functional interface
        Add obj = (i, j) -> System.out.println(i + j);       // Lambda Expression
        obj.add(a, (int) b);
        // System.out.println(Add.str());
        // System.out.println(obj.defaultMethod(5,7));

        
        // Using inbuilt functional interface
        BiConsumer<Integer, Integer> bc = (c,d) -> System.out.println(d+c);
        bc.accept(67,8);                                                // inbuilt method
    }
}


@FunctionalInterface    // 1
interface Add {
    void add(int a, int b);

    default String defaultMethod(int l, int m){         // default method implementaion in FI
        double res = l*m;
        return res+" Executing default method";
    }

    static String str() {                               // static method implementation in Functional interface
        return "Creating static method";
    }
}
/* --- Notes ---
Lambda Expression :- Here the lamda expression is taking 2 inputs i,j and adding those numbers and printing it
                        The lamda expression is getting the values from "add" abstract method present in "Add" interface


1. Functional interface : An interface which contains only one abstact method.
    It may contains multiple default and static methods

 */

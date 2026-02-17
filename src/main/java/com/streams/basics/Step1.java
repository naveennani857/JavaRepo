package com.streams.basics;

import data.List_of_Data;

import java.util.List;
import java.util.stream.Stream;

/*--  --*/
public class Step1 {

    /*-- most commonly used intermediate operations: filter, map, sorted, and limit.  --*/
    public static void main(String[] args) {
        Step1 s = new Step1();
        s.intermediateOperations();

    }
    public void intermediateOperations(){
        //filter: filters the stream --output: boolean
        List<String> names = List_of_Data.immutableNamesList();

        Stream<String> st = names.stream()
                .filter(name -> name.length() > 5);
        System.out.println(st);
    }

}

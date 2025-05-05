package com.ultron.streams;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBasic {
    public static void execute(){
        StreamBasic sb = new StreamBasic();
        //sb.method1();
        //sb.primitiveStream();
        sb.streamOfDiffs();
    }
    public void method1(){
        Collection collecton = Arrays.asList("aa","bb","cc");
        Stream stream=collecton.stream();
        //stream.forEach(System.out::println);

        /* Generate the stream using Generate method */
        Stream streamGenerated = Stream.generate(() ->"element").limit(10);
        //streamGenerated.forEach(System.out::println);

        /* Generate the stream using the Iterate method */
        Stream streamIterated = Stream.iterate(40,n->n+2).limit(10);
        streamIterated.forEach(System.out::println);
    }
    public void primitiveStream(){
        /* Java 8 allows 3 types of primitive variables to create the streams
         *  IntStream, DoubleStream, LongStream  */
        //IntStream.range(1, 100).forEach(x-> System.out.print(x+" "));;

        //LongStream.rangeClosed(1,100).forEach(x-> System.out.print(x+" "));

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(x-> System.out.print(x+" "));
    }
    public void streamOfDiffs(){
        /* There is no CharStream in java so we use IntSteam of chars() to represent the character Stream */
        IntStream intStreamOfChars = "abc".chars();
        intStreamOfChars.forEach(x-> System.out.print(x+" "));

        String str = "a,b,c,d,e,f,g,h";

        Stream streamOfString = Pattern.compile(",").splitAsStream(str);
        streamOfString.forEach(x-> System.out.print(x+" "));
    }
}
package com.interview.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Java";
        usingStreams(str);
        //getReverseOfStringUsingTraditionalWay2(str);

        //usingStringBuilder(str);
    }
    private static void usingStreams(String str) {
        String reversed = IntStream.range(0,str.length())
                .map(i -> str.charAt(str.length()-i-1))
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());

        IntStream.range(0,str.length())
                .mapToObj(i -> str.valueOf(str.charAt(str.length()-i-1)))
                .forEach(s-> System.out.println(s));

        //System.out.println(reversed);

    }


    private static void getReverseOfStringUsingTraditionalWay(String str) {
        String revString = "";
       for (char ch : str.toCharArray()){
           revString = ch+revString;
       }
        System.out.println(revString);
    }
    private static void getReverseOfStringUsingTraditionalWay2(String str) {
        String revString = "";
        for(int i =0; i< str.length(); i++){
            revString = str.charAt(i)+revString;
        }
        System.out.println(revString);
    }
    private static void usingStringBuilder(String str) {
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
    }
}

package com.streams.streamWithNumbers;
import data.RandomNumberList;

import java.util.*;

public class SumOfNumbersInList {
    public static void main(String[] args) {
        List<Integer> nums = RandomNumberList.getRandomNumberList(10,1,10);
        System.out.println("List of Numbers : "+nums);

        //Optional<Integer> sum = nums.stream().reduce((x,y) -> x+y);   //with Lambda
        Optional<Integer> sum = nums.stream().reduce(Integer::sum);     //with method Reference

        System.out.println(sum.get());

    }
}

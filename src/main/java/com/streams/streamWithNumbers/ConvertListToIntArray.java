package com.streams.streamWithNumbers;

import com.streams.entities.RandomNumberList;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Program to convert back List of Integers to Array */
public class ConvertListToIntArray {

    public int[] listToArray(List<Integer> list) {
        System.out.println(list.getClass());
        int[] numsArray = new int[list.size()];
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = list.get(i);
        }

        return numsArray;
    }

    public int[] listToArrayUsingStreams(List<Integer> numbersList){
        //intValue method extracts raw int from the Integer wrapper object
        //return numbersList.stream().mapToInt(x -> x.intValue()).toArray();
        return numbersList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ConvertListToIntArray c = new ConvertListToIntArray();
        int[] arr = c.listToArray(RandomNumberList.getRandomNumberList(10));
        int[] arr2 = c.listToArrayUsingStreams(RandomNumberList.getRandomNumberList(10));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass());
    }
}

/*-- --*/
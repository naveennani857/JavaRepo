package com.streams.streamWithNumbers;

import com.streams.ConvertPrimitiveArrayToList;

import java.util.Arrays;
import java.util.List;

public class StreamWithNumbers {
    public static void main(String[] args) {
        //Converting int[] to list
        int[] numbers = {2,4,5,3,4,6,87,65,23,12,345};
        List<Integer> numberList = ConvertPrimitiveArrayToList.usingStreams(numbers);
        //List<Integer> numberList = ConvertPrimitiveArrayToList.usingLoops(numbers);


        //Convert List into int[]

    }

}

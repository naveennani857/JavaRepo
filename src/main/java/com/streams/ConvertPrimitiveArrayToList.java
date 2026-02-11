package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertPrimitiveArrayToList {
    public static List<Integer> usingStreams(int[] numbers) {
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new)); //Modifiable List(gives ArrayList
                //.toList();    //Non modifiable list(Don't know which List)

        return numberList;
    }

    public static List<Integer> usingLoops(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers){
            numberList.add(num);
        }

        return numberList;
    }
    //collect(Collectors.toCollection(ArrayList::new))
}

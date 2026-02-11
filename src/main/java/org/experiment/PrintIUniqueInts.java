package org.experiment;

import com.streams.entities.RandomNumberList;

import java.util.LinkedList;
import java.util.List;

public class PrintIUniqueInts {
    public static void main(String[] args) {
        //List<Integer> numberList = RandomNumberList.getRandomNumberList(20);
        List<Integer> numberList = List.of(51, 46, 30, 64, 95, 28, 21, 36, 17, 69,28, 21, 36, 17);
        System.out.println(numberList);

        System.out.println(uniqueNumbersList(numberList));
    }

    public static List<Integer> uniqueNumbersList(List<Integer> numberList){
        List<Integer> uniqueList = new LinkedList<>();
        uniqueList.add(numberList.getFirst());

        for (int element : numberList) {
            boolean isPresent = false;

            for (int uniqueElement : uniqueList){
                if(element == uniqueElement){
                    isPresent = true;
                    break;
                }
            }

            if(!isPresent){
                uniqueList.add(element);
            }

        }
        return uniqueList;
    }
}

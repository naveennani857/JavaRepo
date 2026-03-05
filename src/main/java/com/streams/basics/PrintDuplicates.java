package com.streams.basics;

import javax.swing.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicates {
    public static void main(String[] args) {
        List<Integer>  list = List.of(1, 2, 3, 4, 5,4,5,6,7,8,9,2);
        //printDuplicates(list);
        //printDuplicatesUsingFrequency(list);
        printDuplicatesUsingSet(list);
    }

    private static void printDuplicates(List<Integer> list) {
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        map.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .forEach(e -> System.out.print(e.getKey()+" "));
    }

    private static void printDuplicatesUsingFrequency(List<Integer> list) {
        list.stream()
                .filter(itm -> Collections.frequency(list, itm) > 1)
                .distinct()
                .forEach(itm -> System.out.print(itm+" "));
    }

    private static void printDuplicatesUsingSet(List<Integer> list) {

        Set<Integer> set = new HashSet<>();
        list.stream()
                .filter(itm -> !set.add(itm))
                .distinct()
                .forEach(itm -> System.out.print(itm+" "));
    }

}

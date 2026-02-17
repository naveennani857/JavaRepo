package org.experiment;

import java.util.HashMap;
import java.util.Map;

public class FindElement_RepeatedMoreThanHalfOfLengthTimes {
    public static void main(String[] args) {
        int[] array = {5, 5, 1, 1, 1, 5, 1};
        UsingForAndMap(array);
    }
    static void UsingForAndMap(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int number : array){
            map.put(number,map.getOrDefault(number, 0)+1);
        }
        System.out.println(map);

        map.forEach((key,value) -> {
            if (value >= 4) {
                System.out.println(key);
            }
        });
    }
}

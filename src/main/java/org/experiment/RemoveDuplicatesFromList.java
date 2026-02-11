package org.experiment;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> oList = Arrays.asList("Car", "Bike", "Bus", "Car", "truck", "bike", "Car", "cycle", "auto","Car","Car");
        System.out.println(oList.getClass());
       // System.out.println(removeDuplicatesUsingTraditionalMethod(oList));
        System.out.println(removeDuplicatesUsingForLoops(oList));
        //System.out.println(removeDuplicatesUsingStreams(list));
    }
    /* =============================================================================================== */

    /* =============================================================================================== */
    public static List<String> removeDuplicatesUsingTraditionalMethod(List<String> originalList){
        List<String> uniqueList = new ArrayList<>();
        for(String element : originalList){
            if(!isPresentInList(uniqueList,element)){
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
    public static boolean isPresentInList(List<String> list, String element){
        for(String item : list){
            if(element.equals(item)){
                return true;
            }
        }
        return false;
    }
    /* =============================================================================================== */

    /* =============================================================================================== */
    public static List<String> removeDuplicatesUsingForLoops(List<String> originalList){
        List<String> uniqueStrings = new LinkedList<>();

        for (String element : originalList){
            boolean isPresent = false;

            for (String str : uniqueStrings){
                if (element.equals(str)){
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent){
                uniqueStrings.add(element);
            }
        }
        return uniqueStrings;
    }
    /* =============================================================================================== */

    /* =============================================================================================== */
    public static List<String> removeDuplicatesUsingStreams(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
    /* =============================================================================================== */

}

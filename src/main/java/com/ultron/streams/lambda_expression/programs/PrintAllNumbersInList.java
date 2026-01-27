package com.ultron.streams.lambda_expression.programs;

import java.util.List;

public class PrintAllNumbersInList {

    public static void main(String[] args) {
        List<Integer> numList = List.of(3,4,5,6,7,8,9,12,34,5,6,7);

        // for (Integer num : numList) {
        //     System.out.print(num+", ");
        // }

        numList.forEach(num -> System.out.println(num));        // List do have inbuilt method "forEach" --- Best way

       InnerPrintAllNumbersInList il = v -> System.out.println(v); // worst way
        for(int i =0 ; i<numList.size(); i++){
            il.forEachMethod(numList.get(i));
        }
    }

}

@FunctionalInterface
interface InnerPrintAllNumbersInList {
    void forEachMethod(int x);
}

package com.ultron.in30Minutes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectAndCollectors {
    public static void main(String[] args) {
        List<String> list = List.of("Naveen","Srikanth", "Siri","Naveen");
        List<String> list1 = Stream.of("Naveen","Srikanth", "Siri")
            .collect(Collectors.toList());
        list1.sort(Comparator.reverseOrder());

        System.out.println("List Values : "+list1);

        
        System.out.println("Joining : \t"+
        list.stream().collect(Collectors.joining(" ","[","]"))
        );
        
        System.out.println("groupingBy : \t"+
        list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
        );

        System.out.println("partitionBy :\t "+
            list.stream()
                .collect(Collectors.partitioningBy(l->l.equals("Naveen"))));
    }
}

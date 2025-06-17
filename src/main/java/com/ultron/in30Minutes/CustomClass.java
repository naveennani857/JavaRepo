package com.ultron.in30Minutes;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomClass {

    public static void main(String[] args) {
        List<Courses> cources = List.of(
            new Courses("Java","Language",98,20000),
            new Courses("Python","Language",95,18000),
            new Courses("Spring","Framework",98,12000),
            new Courses("Django","Framework",98,14000),
            new Courses("AWS","Cloud",88,9000),
            new Courses("AZURE","Cloud",80,8000),
            new Courses("DevOps","Cloud",98,20000),
            new Courses("Spring Boot","Framework",98,20000)
        );
       // System.out.println(cources);
        //allMatch, noneMatch, anyMatch
        System.out.println("allMatch() :: noneMatch() :: anyMatch()");
        Predicate<Courses> noOfStudentsPredicate = cource -> cource.getNoOfStudents()>15000;   // Predicate to check the number of student is </> given number.
        System.out.println(cources.stream().allMatch(noOfStudentsPredicate));
        System.out.println(cources.stream().noneMatch(noOfStudentsPredicate));
        System.out.println(cources.stream().anyMatch(noOfStudentsPredicate));

        /* Play around woth sorting and Comparator 
         * Sort the stream by number of students with the help of comparator
        */
        System.out.println("\n\nsorting and Comparator ");
        Comparator<Courses> sortingByNoOfStudents                              //comparing for the classes for primitives we have 
                = Comparator.comparingInt(Courses::getNoOfStudents);   //comparingInt,comparingDouble

        Comparator<Courses> sortingByNoOfStudentsAndRating
                = Comparator.comparingInt(Courses::getNoOfStudents).thenComparing(Courses::getRating);

        System.out.println(
            cources.stream()                                    //stream through the cources
                    .sorted(sortingByNoOfStudents)             //sort by the criteria
                    .collect(Collectors.toList())                // collect the values to list
                    .reversed()
        );    
        
        System.out.println(
            cources.stream()                                    //stream through the cources
                    .sorted(sortingByNoOfStudentsAndRating)             //sort by the criteria
                    .collect(Collectors.toList())                // collect the values to list
                    .reversed()
        ); 

        /* sorted : gives the natural ordering
         * comparator : used for custom comparing
         * comparing() : used for custom comparision on clasess
         * comparingInt() : for primitives number variables we have comparingInt and comparingDouble and comparingLong 
         *                  which are helpful to work with primitives, saves time by not doing autoboxing and unboxing
         */

        System.out.println("\n\nlimit() , skip(), takeWhile(), dropWhile() ");
         /* limit() , skip(), takeWhile(), dropWhile()*/
         System.out.println(
            cources.stream()                                    //stream through the cources
                    .sorted(sortingByNoOfStudentsAndRating)             //sort by the criteria
                    .limit(3)
                    .skip(1)
                    .collect(Collectors.toList())                // collect the values to list
                    .reversed()
        ); 

         System.out.println(
            cources.stream()                                    //stream through the cources
                    .takeWhile(x -> x.getRating()>95)
                    .collect(Collectors.toList())                // collect the values to list
        ); 

          System.out.println(
            cources.stream()                                    //stream through the cources
                    .dropWhile(x -> x.getRating()>95)
                    .collect(Collectors.toList())                // collect the values to list
        ); 

        System.out.println("max, min, findFirst, findAny");
        /* max(comparator),min(comparator) : accepts the comparator returns optional
         * findAny(),findFirst : find the elements from the stream based on their criteria
        */
       
        System.out.println(
                cources.stream()
                        .filter(noOfStudentsPredicate)
                        .max(sortingByNoOfStudents)
        );

        System.out.println(
                cources.stream()
                        .filter(noOfStudentsPredicate)
                        .min(sortingByNoOfStudents)
        );
        System.out.println(
                cources.stream()
                        .filter(noOfStudentsPredicate)
                        .findAny()
        );
        System.out.println(
                cources.stream()
                        .filter(noOfStudentsPredicate)
                        .findFirst()
        );
        
        System.out.println("sum, average and count");

        System.out.println(
                cources.stream()
                        .filter(x -> x.getcourseType() == "Framework")
                        .mapToInt(Courses::getNoOfStudents)
                        .sum()
        );

         System.out.println(
                cources.stream()
                        .filter(x -> x.getcourseType() == "Framework")
                        .mapToInt(Courses::getNoOfStudents)
                        .average()
        );
         System.out.println(
                cources.stream()
                        .filter(x -> x.getcourseType() == "Framework")
                        .mapToInt(Courses::getNoOfStudents)
                        .count()
        );

        System.out.println("Grouping");

        System.out.println(
                cources.stream()
                        .collect(Collectors.groupingBy(Courses::getcourseType))
        );

        System.out.println(
                cources.stream()
                        .collect(Collectors.groupingBy(Courses::getcourseType,Collectors.counting()))
        );

        System.out.println(
                cources.stream()
                        .collect(Collectors.groupingBy(Courses::getcourseType,
                                Collectors.maxBy(Comparator.comparing(Courses::getRating))))
        );
         System.out.println(
                cources.stream()
                        .collect(Collectors.groupingBy(Courses::getcourseType,
                                Collectors.mapping(Courses::getcourse, Collectors.toCollection(LinkedList::new))))
        );

    }
}

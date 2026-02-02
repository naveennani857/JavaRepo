package com.ultron.Practice;

import java.util.*;
public class StudentMain {
    public static void main(String[] args) {

    // List<Student> getStudents = AccessDataFromFile.getStudents();
    // System.out.println(getStudents);

    List<Student> getStudentsFromFileReaderList = AccessDataFromFile.getStudentsByFileReader();
    System.out.println(getStudentsFromFileReaderList);

    }
}

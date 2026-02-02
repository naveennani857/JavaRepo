package com.ultron.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class AccessDataFromFile {

    static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        Student.class // Every Java class has a .class object created by JVM.
                                // It contains metadata about the class (name, package, classloader, etc.).
                                // 💡 Why use this?
                                // Because from a class, we can access the ClassLoader that loaded it.
                                .getClassLoader()
                                // In Java, the ClassLoader is responsible for both loading classes and locating
                                // resources (like .txt, .xml, or image files)
                                .getResourceAsStream("studentData.txt") // Search for StudentData.txt in resource
                                                                        // location
                ))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int rollNo = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                double percentage = Double.parseDouble(data[3].trim());

                students.add(new Student(rollNo, name, age, percentage));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
    static List<Student> getStudentsByFileReader(){
        List<Student> students = new LinkedList<>();

        try(BufferedReader reader = new BufferedReader(
            new FileReader("src/main/resources/studentData.txt")
        )) {
                String line;
                while((line = reader.readLine())  != null) {
                    String[] data = line.split(",");

                    int rollNo = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    double percentage = Double.parseDouble(data[3].trim());

                    students.add(new Student(rollNo,name,age,percentage));
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}

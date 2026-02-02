package com.ultron.Practice;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private double percentage;

    public Student(int rollNo, String name, int age, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
    }

    

    
}

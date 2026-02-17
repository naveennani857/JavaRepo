package data;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    String address;
    String occupation;

    public Person(String name, int age, String address, String occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
    }

    public static List<Person> personList(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice Johnson", 28, "123 Maple St, Seattle", "Software Engineer"));
        people.add(new Person("Marcus Chen", 34, "456 Oak Ave, Chicago", "Data Scientist"));
        people.add(new Person("Sarah O'Connor", 42, "789 Pine Rd, Austin", "Graphic Designer"));
        people.add(new Person("David Kim", 25, "101 Cedar Ln, San Francisco", "Marketing Specialist"));
        people.add(new Person("Elena Rodriguez", 31, "202 Birch Blvd, Miami", "Civil Engineer"));
        people.add(new Person("James Wilson", 55, "303 Willow Dr, Denver", "High School Teacher"));
        people.add(new Person("Priya Patel", 29, "404 Elm Ct, Boston", "Research Scientist"));
        people.add(new Person("Liam Smith", 38, "505 Spruce Way, Portland", "Nurse Practitioner"));
        people.add(new Person("Chloe Dubois", 22, "606 Aspen Pl, New York", "Social Media Manager"));
        people.add(new Person("Robert Taylor", 47, "707 Juniper Dr, Atlanta", "Financial Advisor"));

        return people;
    }
}

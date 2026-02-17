package org.person;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("tab1", 900.00, "Manager");
        Person p2 = new Person("tab2", 1000.00, "Developer");
        Person p3 = new Person("tab3", 800.00, "Tester");
        Person p4 = new Person("tab4", 900.90, "Spoc");

        List<Person> personList = List.of(p1,p2,p3,p4);

    }
}

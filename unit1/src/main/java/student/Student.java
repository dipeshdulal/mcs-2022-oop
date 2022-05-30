package main.java.student;

public class Student {
    String firstName;
    String lastName;

    Student(String first, String second) {
        firstName = first;
        lastName = second;
    }

    void sayName() {
        System.out.println("Hello! "+firstName + " " + lastName);
    }
}
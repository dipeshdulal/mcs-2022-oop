package main.java.student;

public class Student {
    String firstName;
    String lastName;
    Integer rollNo = 10;

    Student(String first, String second) {
        firstName = first;
        lastName = second;
    }

    Student(String first, String second, Integer rollNo) {
        firstName = first;
        lastName = second;
        this.rollNo = rollNo;
    }

    void sayName() {
        System.out.println("Hello! " + firstName + " " + lastName);
        System.out.println("Roll No: " + rollNo.toString());
        System.out.println("HashCode: " + this.hashCode());
        System.out.println("--------------");
    }
}
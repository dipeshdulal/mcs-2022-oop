package main.java.student;

public class Student {
    String firstName;
    String lastName;
    Integer rollNo = 10;
    DOB dob = new DOB(1, 2022, 12);

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
        System.out.println("DOB: " + dob.day + "-" + dob.month + "-" + dob.year);
        System.out.println("--------------");
    }
}

class DOB {
    int day;
    int year;
    int month;

    DOB() {
    }

    DOB(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }
}
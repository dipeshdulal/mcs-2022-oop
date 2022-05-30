package main.java.student;

import main.java.teacher.Teacher;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ujjwol", "Kayastha");
        s.sayName();

        Teacher t = new Teacher("Chetra Bahadur Chettri");
        t.sayName();
    }
}

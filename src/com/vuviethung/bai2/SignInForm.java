package com.vuviethung.bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SignInForm {
    List<Student> students = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();

    private int numberOfStudent;
    private int numberOfSubject;

    public SignInForm(int numberOfStudent, int numberOfSubject) {
        this.numberOfStudent = numberOfStudent;
        this.numberOfSubject = numberOfSubject;
    }

    public void inputListOfStudents() {
        for (int i = 0; i < numberOfStudent; i++) {
            Student student = new Student();
            student.intputStudent();
            this.students.add(student);
        }
    }

    public void inputListOfSubject(){
        for (int i = 0; i < numberOfSubject; i++) {
            Subject subject = new Subject();
            subject.inputSubject();
            this.subjects.add(subject);

        }
    }

    public void outputListOfStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void outputListOfSubject() {
        System.out.println(subjects);
    }

    public void sortListStudentByName(){
        System.out.println("sap xep sv theo ten");
        for (Student student: students) {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void sortListStudentByDate(){
        System.out.println("xep theo ngay dki");
        for (Student student:students
             ) {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getDate().compareTo(o1.getDate());
                }
            });
        }
    }
}
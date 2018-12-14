package com.vuviethung.bai2;

public class Main {
    public static void main(String[] args) {
        SignInForm signInForm = new SignInForm(3,2);
        signInForm.inputListOfStudents();
        signInForm.inputListOfSubject();
        System.out.println("=================================");
        signInForm.outputListOfStudent();
        signInForm.outputListOfSubject();
        signInForm.sortListStudentByDate();
        signInForm.sortListStudentByName();
    }
}

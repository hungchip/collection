package com.dekiemtra;

import java.util.Date;
import java.util.Scanner;

public class GiangVienThinhGiang extends Teacher {
    private int term;
    private int numberOfLesson;

    public GiangVienThinhGiang(String iDTeacher, String teacherName, Date dateOfBirth, int degree, Date dateComeIn, Detail detail, int term, int numberOfLesson) {
        super(iDTeacher, teacherName, dateOfBirth, degree, dateComeIn, detail);
        this.term = term;
        this.numberOfLesson = numberOfLesson;
    }

    public GiangVienThinhGiang(int term, int numberOfLesson) {
        this.term = term;
        this.numberOfLesson = numberOfLesson;
    }

    public GiangVienThinhGiang() {
        super();
        this.term = 0;
        this.numberOfLesson =0;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    @Override
    public void inputTeacher() {
        super.inputTeacher();
        System.out.println("Nhập học kì");
        this.term = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tiết thực giảng");
        this.numberOfLesson = new Scanner(System.in).nextInt();
    }

    @Override
    public void outputTeacher() {
        super.outputTeacher();
        System.out.println("Học kì" + term+
                            "Số tiết thực giảng" + numberOfLesson);
    }
}

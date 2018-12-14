package com.vuviethung.bai2;

import java.util.Scanner;

public class Subject {
    private static int subjectID = 100;
    private int maso;
    private String subjectName;
    private int totalLesson;
    private String subjectType;

    public Subject(String subjectName, int totalLesson, String subjectType) {
        subjectID++;
        this.subjectName = subjectName;
        this.totalLesson = totalLesson;
        this.subjectType = subjectType;
    }

    public Subject() {
        this.maso = subjectID++;
        this.subjectName = "";
        this.totalLesson = 0;
        this.subjectType = "";
    }

    public static int getSubjectID() {
        return subjectID;
    }

    public static void setSubjectID(int subjectID) {
        Subject.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public void inputSubject(){
        //subjectID++;
        System.out.println("Nhap ten mon hoc");
        this.subjectName = new Scanner(System.in).nextLine();
        System.out.println("Nhap tong so tiet");
        this.totalLesson = new Scanner(System.in).nextInt();
        System.out.println("Nhap loai mon hoc");
        this.subjectType = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID=" + maso +'\'' +
                "subjectName='" + subjectName + '\'' +
                ", totalLesson=" + totalLesson +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }
}
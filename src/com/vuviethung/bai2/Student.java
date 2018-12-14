package com.vuviethung.bai2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student {
    private static int studentID = 10000;
    private int maso;
    private String name;
    private String address;
    private double phoneNumber;
    private List<Subject> subjects = new ArrayList<>();
    private Date date;

    public Student(String name, String address, double phoneNumber) {
        //studentID++;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Student(){
        this.maso = studentID++;
        this.name = "";
        this.address = "";
        this.phoneNumber =0;
    }

    public static int getStudentID() {
        return studentID;
    }

    public static void setStudentID(int studentID) {
        Student.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void intputStudent() {

        System.out.println("Nhap ten sinh vien");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai");
        this.phoneNumber = new Scanner(System.in).nextInt();
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + maso + '\'' +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                "thoi gian dang ki" + date +
                '}';
    }
}
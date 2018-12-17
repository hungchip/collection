package com.dekiemtra;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public  class Teacher {
    private String iDTeacher;
    private String teacherName;
    private Date dateOfBirth;
    private int degree;
    private Date dateComeIn;
    private Detail detail;

    public Teacher(String iDTeacher, String teacherName, Date dateOfBirth, int degree, Date dateComeIn, Detail detail) {
        this.iDTeacher = iDTeacher;
        this.teacherName = teacherName;
        this.dateOfBirth = dateOfBirth;
        this.degree = degree;
        this.dateComeIn = dateComeIn;
        this.detail = detail;
    }

    public Teacher(){
        this.iDTeacher = "";
        this.teacherName = "";
        this.degree = 0;
        this.detail = new Detail();
    }

    public String getiDTeacher() {
        return iDTeacher;
    }

    public void setiDTeacher(String iDTeacher) {
        this.iDTeacher = iDTeacher;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Date getDateComeIn() {
        return dateComeIn;
    }

    public void setDateComeIn(Date dateComeIn) {
        this.dateComeIn = dateComeIn;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public void inputTeacher(){
        System.out.println("Nhập mã giảng viên");
        this.iDTeacher = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên giảng viên");
        this.teacherName = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngày sinh");
        String ngaysinh = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = dateFormat.parse(ngaysinh);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Nhap học vị");
            this.degree = new Scanner(System.in).nextInt();
            }while (degree !=1 && degree !=2 && degree !=3 && degree !=4 && degree !=5);
        System.out.println("Nhập ngày được nhận");
        String ngaynhan = new Scanner(System.in).nextLine();
        try {
            this.dateComeIn = dateFormat.parse(ngaynhan);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập sơ yếu lý lịch");
        this.detail.inputDetail();
    }

//    public String outputTeacher(){
//        if (degree ==1){
//            System.out.println();
//        }
//    }

    public void outputTeacher() {
        if (degree ==1){
            System.out.println("Teacher{" +
                    "iDTeacher='" + iDTeacher + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", degree= Cử nhân " +
                    ", dateComeIn=" + dateComeIn +
                    '}');
            System.out.println("Sơ yếu lý lịch");
            this.detail.outputDetail();
        }if (degree ==2){
            System.out.println("Teacher{" +
                    "iDTeacher='" + iDTeacher + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", degree= Thạc Sĩ " +
                    ", dateComeIn=" + dateComeIn +
                    '}');
            System.out.println("Sơ yếu lý lịch");
            this.detail.outputDetail();
        }if (degree ==3){
            System.out.println("Teacher{" +
                    "iDTeacher='" + iDTeacher + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", degree= Tiến Sĩ " +
                    ", dateComeIn=" + dateComeIn +
                    '}');
            System.out.println("Sơ yếu lý lịch");
            this.detail.outputDetail();
        }if (degree ==4){
            System.out.println("Teacher{" +
                    "iDTeacher='" + iDTeacher + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", degree= Phó Giáo Sư " +
                    ", dateComeIn=" + dateComeIn +
                    '}');
            System.out.println("Sơ yếu lý lịch");
            this.detail.outputDetail();
        }if (degree ==5){
            System.out.println("Teacher{" +
                    "iDTeacher='" + iDTeacher + '\'' +
                    ", teacherName='" + teacherName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", degree= Giáo Sư " +
                    ", dateComeIn=" + dateComeIn +
                    '}');
            System.out.println("Sơ yếu lý lịch");
            this.detail.outputDetail();
        }
    }
}

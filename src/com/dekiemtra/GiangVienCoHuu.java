package com.dekiemtra;

import java.util.Date;
import java.util.Scanner;

public class GiangVienCoHuu extends Teacher {
    private int numberOfLessonDependOnDegree;
    private int numberOfReserching;
    private double basicWages;

    public GiangVienCoHuu(String iDTeacher, String teacherName, Date dateOfBirth, int degree, Date dateComeIn, Detail detail, int numberOfLessonDependOnDegree, int numberOfReserching, double basicWages) {
        super(iDTeacher, teacherName, dateOfBirth, degree, dateComeIn, detail);
        this.numberOfLessonDependOnDegree = numberOfLessonDependOnDegree;
        this.numberOfReserching = numberOfReserching;
        this.basicWages = basicWages;
    }

    public GiangVienCoHuu(int numberOfLessonDependOnDegree, int numberOfReserching, double basicWages) {
        this.numberOfLessonDependOnDegree = numberOfLessonDependOnDegree;
        this.numberOfReserching = numberOfReserching;
        this.basicWages = basicWages;
    }

    public GiangVienCoHuu() {
        super();
        if (this.getDegree() ==1 || this.getDegree()==2){
            this.numberOfLessonDependOnDegree = 460;
        }else this.numberOfLessonDependOnDegree =560;
        this.numberOfReserching = 0;
    }

    public int getNumberOfLessonDependOnDegree() {
        return numberOfLessonDependOnDegree;
    }

    public void setNumberOfLessonDependOnDegree(int numberOfLessonDependOnDegree) {
        this.numberOfLessonDependOnDegree = numberOfLessonDependOnDegree;
    }

    public int getNumberOfReserching() {
        return numberOfReserching;
    }

    public void setNumberOfReserching(int numberOfReserching) {
        this.numberOfReserching = numberOfReserching;
    }

    public double getBasicWages() {
        return basicWages;
    }

    public void setBasicWages(double basicWages) {
        this.basicWages = basicWages;
    }

    @Override
    public void inputTeacher() {
        super.inputTeacher();
        System.out.println("Nhập số tiết theo nghiên cứu");
        this.numberOfReserching = new Scanner(System.in).nextInt();
        System.out.println("Nhập lương cơ bản");
        this.basicWages = new Scanner(System.in).nextInt();
    }

    @Override
    public void outputTeacher() {
        super.outputTeacher();
        System.out.println("Số tiết theo học vị" +numberOfLessonDependOnDegree+
                            "Số tiết theo nghiên cứu" + numberOfReserching +
                            "Lương cơ bản" + basicWages);
    }
}

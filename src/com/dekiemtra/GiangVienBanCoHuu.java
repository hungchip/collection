package com.dekiemtra;

import java.util.Date;

public class GiangVienBanCoHuu extends Teacher {
    private int numberOfLesson;

    public GiangVienBanCoHuu(String iDTeacher, String teacherName, Date dateOfBirth, int degree, Date dateComeIn, Detail detail, int numberOfLesson) {
        super(iDTeacher, teacherName, dateOfBirth, degree, dateComeIn, detail);
        this.numberOfLesson = numberOfLesson;
    }

    public GiangVienBanCoHuu(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public GiangVienBanCoHuu() {
        super();
        if (this.getDegree()==1 || this.getDegree() ==2){
            this.numberOfLesson = 460/3;
        }else this.numberOfLesson =560/3;
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
    }

    @Override
    public void outputTeacher() {
        super.outputTeacher();
        System.out.println("Số tiết" + numberOfLesson);
    }
}

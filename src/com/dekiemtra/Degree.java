package com.dekiemtra;

import java.util.Scanner;

public class Degree {
    private static final int cap1=1;
    private String schoolName;
    private int level;
    private int dateOfGraduate;

    public Degree(String schoolName, int level, int dateOfGraduate) {
        this.schoolName = schoolName;
        this.level = level;
        this.dateOfGraduate = dateOfGraduate;
    }

    public Degree() {
        this.schoolName = "";
        this.level = 0;
        this.dateOfGraduate = 0;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDateOfGraduate() {
        return dateOfGraduate;
    }

    public void setDateOfGraduate(int dateOfGraduate) {
        this.dateOfGraduate = dateOfGraduate;
    }

    public void nhapbangCap() {
        System.out.println("Nhap ten truong cap");
        this.schoolName = new Scanner(System.in).nextLine();
        do {
            System.out.println("Nhap học vị");
            this.level = new Scanner(System.in).nextInt();
        }while (this.level !=1 && this.level !=2 && this.level !=3 && this.level !=4 &&this.level !=5);
        System.out.println("Nhap nam cap ");
        this.dateOfGraduate = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        if(this.level ==1){
        return "Degree{" +
                "schoolName='" + schoolName + '\'' +
                ", level= Cử nhân" +
                ", dateOfGraduate=" + dateOfGraduate +
                '}';
        }   if(this.level == 2){
            return "Degree{" +
                    "schoolName='" + schoolName + '\'' +
                    ", level= Thạc Sĩ" +
                    ", dateOfGraduate=" + dateOfGraduate +
                    '}';
        }   if(this.level ==3) {
            return "Degree{" +
                    "schoolName='" + schoolName + '\'' +
                    ", level= Tiến Sĩ" +
                    ", dateOfGraduate=" + dateOfGraduate +
                    '}';
        }if (this.level ==4) {
            return "Degree{" +
                    "schoolName='" + schoolName + '\'' +
                    ", level= Phó Giáo Sư"  +
                    ", dateOfGraduate=" + dateOfGraduate +
                    '}';
        }return "Degree{" +
                "schoolName='" + schoolName + '\'' +
                ", level= Giáo Sư" +
                ", dateOfGraduate=" + dateOfGraduate +
                '}';
    }
}

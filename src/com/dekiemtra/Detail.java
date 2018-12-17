package com.dekiemtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Detail {
    //private static final int nam=1;
   // private static final int nu=2;
    private String name;
    private int sex;
    private String email;
    private int phoneNumber;
    private List<Degree> degrees = new ArrayList<>();

    public Detail(String name, int sex, String email, int phoneNumber, List<Degree> degrees) {
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.degrees = degrees;
    }

    public Detail() {
        this.name = "";
        this.sex = 0;
        this.email = "";
        this.phoneNumber =0;
        List<Degree> degrees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public void inputDetail(){
        System.out.println("Nhap tên ");
        this.name = new Scanner(System.in).nextLine();
        do {
            System.out.println("Nhap giới tinh");
            this.sex = new Scanner(System.in).nextInt();
        }while( sex !=1 && sex !=2);
        System.out.println("Nhap email");
        this.email = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai");
        this.phoneNumber = new Scanner(System.in).nextInt();
        this.inputDegree();
    }

    public void inputDegree(){
        System.out.println("Nhap so bang cap");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            Degree degree = new Degree();
            degree.nhapbangCap();
            degrees.add(degree);
        }
    }

    public void outputDetail(){
        if(this.getSex() ==1){
            System.out.println("Tên" + name + "\n" +
                    "Giới tính = Nam" + "\n" +
                    "Email" + email + "\n" +
                    "Số điện thoại" + "\n"+
                    "Danh Sach bằng cấp" + degrees);
        }else{
            System.out.println(" Tên " + name + "\n" +
                    " Giới tính = Nữ" + "\n" +
                    " Email " + email + "\n" +
                    " Số điện thoại " + "\n"+
                    " Danh Sach bằng cấp " + degrees);
        }
    }
}

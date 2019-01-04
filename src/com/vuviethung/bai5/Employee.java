package com.vuviethung.bai5;

import java.util.Scanner;

public class Employee {
    private static int ID = 1000;
    private int employeeID;
    private String name;
    private String address;
    private int phoneNumber;
    private int wageLevel;

    public Employee(int employeeID, String name, String address, int phoneNumber, int wageLevel) {
        this.employeeID = employeeID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        if (wageLevel >0 &&wageLevel <=9){
            this.wageLevel = wageLevel;
        }else this.wageLevel =1;
    }

    public Employee() {
        this.employeeID = ID++;
        this.name = "";
        this.address = "";
        this.phoneNumber = 0;
        this.wageLevel =1;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Employee.ID = ID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWageLevel() {
        return wageLevel;
    }

    public void setWageLevel(int wageLevel) {
        this.wageLevel = wageLevel;
    }

    public void inputEmployee(){
        System.out.println("nhập tên nhân viên");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại");
        this.phoneNumber = new Scanner(System.in).nextInt();
        do{
            System.out.println("Nhập mức lương");
            this.wageLevel = new Scanner(System.in).nextInt();
        }while (this.wageLevel<1&&this.wageLevel>9);
    }

    public void outputEmployee(){
        System.out.println(" Mã nhân viên " + this.employeeID +
                " tên nhân viên " + this.name+
                " địa chỉ " + this.address +
                " Số điện thoại " + this.phoneNumber +
                " mức lương " + this.wageLevel);
    }
}

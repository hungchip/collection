package com.vuviethung.bai3;

import java.util.Scanner;

public class Customer {
    private static int ID=10000;
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int phoneNumber;

    public Customer(int customerID, String customerName, String customerAddess, int phoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddess;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
        this.customerID = ID++;
        this.customerName = "";
        this.customerAddress = "";
        this.phoneNumber = 0;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Customer.ID = ID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputCustomer() {
        System.out.println("Nhap ten khach hang");
        this.customerName = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi ");
        this.customerAddress = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai");
        this.phoneNumber = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

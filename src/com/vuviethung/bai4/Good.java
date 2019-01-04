package com.vuviethung.bai4;

import java.util.Scanner;

public class Good {
    private static int ID =1000;
    private int goodID;
    private String goodName;
    private int goodType;
    private double price;
    private double amount;

    public Good(int goodID, String goodName, int goodType, double price, double amount) {
        this.goodID = goodID;
        this.goodName = goodName;
        this.goodType = goodType;
        this.price = price;
        this.amount = amount;
    }

    public Good(){
        this.goodID = ID++;
        this.goodName = "";
        this.goodType = 0;
        this.price = 0;
        this.amount = 0;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Good.ID = ID;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodType() {
        return goodType;
    }

    public void setGoodType(int goodType) {
        this.goodType = goodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void intputGood(){
        System.out.println("Nhập tên hàng: ");
        this.goodName = new Scanner(System.in).nextLine();
        System.out.println("Nhập nhóm hàng");
        this.goodType = new Scanner(System.in).nextInt();
        System.out.println("Nhập giá bán: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng: ");
        this.amount = new Scanner(System.in).nextDouble();
    }

    public void outputGood(){
        System.out.println("{ Mã Hàng " + this.goodID +
                            " Tên hàng: " + this.goodName +
                            " nhóm hàng " + this.goodType +
                            " Giá bán: " + this.price +
                            " số lượng }" + this.amount);
    }
}

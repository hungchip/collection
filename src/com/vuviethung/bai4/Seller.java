package com.vuviethung.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seller {
    private static int ID=1000;
    private int sellerID;
    private String name;
    private String address;
    private int phoneNumber;
    private List<Good> goods = new ArrayList<>();

    public Seller(int sellerID, String name, String address, int phoneNumber) {
        this.sellerID = sellerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public Seller(){
        this.sellerID = ID++;
        this.name = "";
        this.address = "";
        this.phoneNumber =0;
        this.goods = new ArrayList<>();
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Seller.ID = ID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
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

    public void inputSeller(){
        System.out.println("Nhập tên nhân viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại");
        this.phoneNumber = new Scanner(System.in).nextInt();
        this.inputListGoods();
    }

    public void outputSeller() {
        System.out.println("Mã nhân viên" + this.sellerID +
                "Tên nhân viên" + this.name +
                "Địa chỉ" + this.address +
                "Sđt" + this.phoneNumber);
        System.out.println("Danh sách hàng hóa");
        for (Good good : this.goods) {
            good.outputGood();
        }
    }

    public void inputListGoods(){
        int n;
        do {
            System.out.println("Nhập số lượng sản phẩm");
             n = new Scanner(System.in).nextInt();
        }while (n>5);
        for (int i = 0; i <n ; i++) {
            Good good = new Good();
            good.intputGood();
            this.goods.add(good);
        }
    }
}

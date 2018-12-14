package com.vuviethung.bai3;

import java.util.Scanner;

public class Product {
    private static int ID =1000;
    private int productID;
    private String productName;
    private double price;
    private String productType;

    public Product(int productID, String productName, double price, String productType) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }

    public Product(){
        this.productID = ID++;
        this.productName= "";
        this.productType = "";
        this.price = 0;
    }
    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Product.ID = ID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void inputProduct() {
        System.out.println("Nhap ten san pham");
        this.productName = new Scanner(System.in).nextLine();
        System.out.println("Nhap loai san pham");
        this.productType = new Scanner(System.in).nextLine();
        System.out.println("Nhap gia ");
        this.price = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productType=" + productType +
                '}';
    }
}

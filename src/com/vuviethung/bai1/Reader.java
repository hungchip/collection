package com.vuviethung.bai1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader extends Book{
    private static int readerID = 10000;
    private String name;
    private String address;
    private int phoneNumber;
    private List<Book> books = new ArrayList<>();

    public Reader(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Reader(){
        readerID++;
        this.address = "";
        this.name ="";
        this.phoneNumber =0;
        this.books = new ArrayList<>();
    }

    public static int getReaderID() {
        return readerID;
    }

    public static void setReaderID(int readerID) {
        Reader.readerID = readerID;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void nhapBanDoc(){
        System.out.println("Nhap ten ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhap sdt ");
        this.phoneNumber = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", books=" +
                '}';
    }


}

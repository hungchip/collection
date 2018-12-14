package com.vuviethung.bai1;

import java.util.Scanner;

public class Book {
    private static int bookID = 10000;
    private String bookName;
    private String author;
    private String major;
    private int date;
    private int amount;

    @Override
    public String toString() {
        return "Book{" +
                "bookId= " + ++bookID +'\''+
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", major='" + major + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Book(String bookName, String author, String major, int date, int amount) {

        this.bookName = bookName;
        this.author = author;
        this.major = major;
        this.date = date;
        this.amount = amount;
    }

    public Book(String bookName, String author, String major, int date) {
        this.bookName = bookName;
        this.author = author;
        this.major = major;
        this.date = date;
    }

    public Book() {
        bookID++;
        this.bookName = "";
        this.author = "";
        this.major = "";
        this.date = 0;
    }

    public static int getBookID() {
        return bookID;
    }

    public static void setBookID(int bookID) {
        Book.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void nhapSach() {
        System.out.println("nhap ten sach");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten tac gia");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhap chuyen nganh");
        this.major = new Scanner(System.in).nextLine();
        System.out.println("Nhap nam xuat ban");
        this.date = new Scanner(System.in).nextInt();
        System.out.println(" nhap so luong");
        this.amount = new Scanner(System.in).nextInt();
    }


}

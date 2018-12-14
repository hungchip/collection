package com.vuviethung.bai1;

import java.sql.Array;
import java.util.*;

public class Manager {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private int soLoaiSach;
    private int soBanDoc;

    public Manager(int soLoaiSach, int soBanDoc) {
        this.soLoaiSach = soLoaiSach;
        this.soBanDoc = soBanDoc;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addReader(Reader reader){
        readers.add(reader);
    }
    public void outPutBook(){
        for (Book book: books
             ) {
            System.out.println(book);
        }
    }

    public void outPutReader(){
        for (Reader reader:readers
             )
            System.out.println(reader);
    }

//    public void themSachChoBanDoc(Book book1){
//
//        System.out.println("so sach ma ban doc muon");
//        for (Reader reader: readers) {
//            reader.setBooks(books.add(book1));
//        }
//        System.out.println(readers);
//    }

    public void nhapDanhSach(){
        for(int i = 0; i< soLoaiSach; i++){
            Book book = new Book();
            book.nhapSach();
            books.add(book);
        }
    }

    public void nhapBanDoc(){
        for (int i = 0; i < soBanDoc; i++) {
            Reader reader = new Reader();
            reader.nhapBanDoc();
            readers.add(reader);
        }
    }

    public void sortListByReaderName(){
        System.out.println("sap xep danh sach ban doc theo ten");
        readers.sort(new Comparator<Reader>() {
            @Override
            public int compare(Reader o1, Reader o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Reader reader:readers) {
            System.out.println(reader.getName());
        }
    }

    public void sortListByAmountofBook(){

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getAmount() == o2.getAmount())
                    return 0;
                else if (o1.getAmount() > o2.getAmount())
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println("sap xep");
        for (Book book: books
             ) {
            System.out.println(book.getAmount());
        }
    }

    public void findReader(){
        System.out.println("Nhap ban doc muon tim");
        Reader reader1 = new Reader();
        reader1.nhapBanDoc();
        readers.add(reader1);
        for (Reader reader2: readers) {
            if (reader2.getName().equals(reader1.getName())){
                System.out.println(reader2);
            }
        }
    }
}

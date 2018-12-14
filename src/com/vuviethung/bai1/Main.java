package com.vuviethung.bai1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(3,3);
        Book book1 = new Book();
        book1.nhapSach();
        //manager.addBook(book1);
        //manager.outPutBook();
        manager.nhapDanhSach();
        manager.outPutBook();
        manager.nhapBanDoc();
        manager.outPutReader();
        manager.sortListByAmountofBook();
        manager.sortListByReaderName();
        manager.findReader();
    }

}

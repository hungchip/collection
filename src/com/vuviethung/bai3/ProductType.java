package com.vuviethung.bai3;

public enum  ProductType {

    HangThoiTrang(1),
    HangTieuDung(2),
    HangDienMay(3),
    HangGiaDung(4);
    private int id;

    ProductType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

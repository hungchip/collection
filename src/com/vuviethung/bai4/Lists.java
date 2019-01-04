package com.vuviethung.bai4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private List<Good> goods = new ArrayList<>();
    private List<Seller> sellers = new ArrayList<>();

    public Lists(List<Good> goods, List<Seller> sellers) {
        this.goods = goods;
        this.sellers = sellers;
    }

    public void inputListGood(){
        System.out.println("Nhap danh sách hàng hóa:");

    }
}

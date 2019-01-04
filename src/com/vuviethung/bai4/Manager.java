package com.vuviethung.bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private int amountOfSeller;
    private int amountOfGood;
    private List<Seller> sellers = new ArrayList<>();
    private List<Good> goods = new ArrayList<>();

    public Manager(int amountOfSeller, int amountOfGood) {
        this.amountOfSeller = amountOfSeller;
        this.amountOfGood = amountOfGood;
        this.sellers = new ArrayList<>();
        this.goods = new ArrayList<>();
    }

    public void inputListSeller(){
        for (int i = 0; i < amountOfSeller; i++) {
            Seller seller = new Seller();
            seller.inputSeller();
            sellers.add(seller);
        }
    }

    public void inputListGood(){
        for (int i = 0; i < amountOfGood; i++) {
            Good good = new Good();
            good.intputGood();
            goods.add(good);
        }
    }

    public void outputAllOfLists(){
        System.out.println("Danh sách Seller");
        for (Seller s: this.sellers
             ) {
            s.outputSeller();
        }
        System.out.println("Danh sách hàng hóa");
        for (Good g:this.goods
             ) {
            g.outputGood();
        }
    }

    public void sortBySellerName(){
        System.out.println("Sắp xếp nhân viên theo tên");
        for (Seller s: sellers
             ) {
            sellers.sort(new Comparator<Seller>() {
                @Override
                public int compare(Seller o1, Seller o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        for (Seller s:sellers
             ) {
            System.out.println(s);
        }
    }

    public void sortByGoodName(){
        System.out.println("Sắp xếp theo nhóm mặt hàng");
        for (Good g: goods
             ) {
            goods.sort(new Comparator<Good>() {
                @Override
                public int compare(Good o1, Good o2) {
                    return o1.getGoodType() - o2.getGoodType();
                }
            });
        }
    }

    public void doanhThu(){
        for (Seller s: sellers
             ) {
            //s.getGoods().toArray();
            double tong =0;
            for (Good g: s.getGoods()
                 ) {
                tong +=g.getAmount() * g.getPrice();
            }
            System.out.println("doanh thu" + tong);
        }
    }
}

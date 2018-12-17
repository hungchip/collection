package com.test;

import java.util.Scanner;

public class GioiTinh {
    private static final int nam=1;
    private static final int nu=2;
    private int gt;

    public GioiTinh(int gt) {
        this.gt = gt;
    }

    public GioiTinh(){
        this.gt=0;
    }

    public static int getNam() {
        return nam;
    }

    public static int getNu() {
        return nu;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public void nhap(){
        System.out.println("Nhhap");
        this.gt = new Scanner(System.in).nextInt();
        if (gt==1){
            gt=nam;
        }
        if(gt==2){
            gt=nu;
        }
    }

    @Override
    public String toString() {
        return "GioiTinh{" +
                "gt=" + gt +
                '}';
    }
}

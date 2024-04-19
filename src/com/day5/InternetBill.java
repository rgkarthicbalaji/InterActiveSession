package com.day5;

public class InternetBill extends Bill{

    int discount = 0;

    public static void main(String[] args) {
        InternetBill internetBill = new InternetBill();
        internetBill.setBillAmount(100);
        internetBill.setDiscount(20);
        System.out.println(internetBill.getBillAmount()-(internetBill.getBillAmount()*internetBill.getDiscount())/100);
    }

    public int getDiscount() {
        return 0;
    }
}

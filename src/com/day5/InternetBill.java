package com.day5;

public class InternetBill extends Bill{


    public static void main(String[] args) {
        InternetBill internetBill = new InternetBill();
        internetBill.setBillAmount(100);
        System.out.println(internetBill.getBillAmount()-internetBill.calculateDiscount());
    }

    @Override
    public int calculateDiscount() {
        return ((this.billAmount*20)/100);
    }
}

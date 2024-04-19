package com.day5;

public class InternetBill extends Bill{
    @Override
    public void setDiscount() {

    }

    @Override
    public int getDiscount() {
        return 0;
    }

    public static void main(String[] args) {
        InternetBill internetBill = new InternetBill();
        internetBill.setBill(100);
        internetBill.getBill();

    }

}

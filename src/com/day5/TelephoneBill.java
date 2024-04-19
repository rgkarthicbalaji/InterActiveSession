package com.day5;

public class TelephoneBill extends Bill{
    public static void main(String[] args) {
        //Object or Instantiation is performed for child class i.e AbstractImplExample
        TelephoneBill telephoneBill = new TelephoneBill();
        telephoneBill.setBill(100);
        System.out.println(telephoneBill.getBill());
    }

    @Override
    public void setDiscount() {

    }

    @Override
    public int getDiscount() {
        return 0;
    }
}

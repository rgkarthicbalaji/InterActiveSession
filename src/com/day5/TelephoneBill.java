package com.day5;

public class TelephoneBill extends Bill{

    int discount = 0;
    public static void main(String[] args) {
        //Object or Instantiation is performed for child class i.e AbstractImplExample
        TelephoneBill telephoneBill = new TelephoneBill();
        telephoneBill.setBillAmount(100);
        System.out.println(telephoneBill.getBillAmount()- telephoneBill.calculateDiscount());
    }

    @Override
    public int calculateDiscount() {
        return ((this.billAmount*0)/100);
    }
}

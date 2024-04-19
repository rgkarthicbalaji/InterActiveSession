package com.day5;

public class TelephoneBill extends Bill{

    int discount = 0;
    public static void main(String[] args) {
        //Object or Instantiation is performed for child class i.e AbstractImplExample
        TelephoneBill telephoneBill = new TelephoneBill();
        telephoneBill.setBillAmount(100);
        telephoneBill.setDiscount(0);
        System.out.println(telephoneBill.getBillAmount()-(telephoneBill.getBillAmount()*telephoneBill.getDiscount())/100);
    }


    @Override
    public int getDiscount() {
        return 0;
    }
}

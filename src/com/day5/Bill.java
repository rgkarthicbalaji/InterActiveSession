package com.day5;

/*Abstraction is hiding the class to external world, which makes no direct instantiation of that class,
which can have full 1. abstract methods or 2. combination of implemented and abstract methods or 3. fully implemented methods*/
public abstract class Bill {

    /*Bill(int billAmount, int discount){
        this.billAmount = billAmount;
        this.discount = discount;
    }*/

    int billAmount = 0;

    int discount = 0;

    public void setBillAmount(int billAmount){
        this.billAmount = billAmount;
    }
    public int getBillAmount(){
        return this.billAmount - ((this.billAmount*this.discount)/100);
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public abstract int getDiscount();


}



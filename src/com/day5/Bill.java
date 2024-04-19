package com.day5;

/*Abstraction is hiding the class to external world, which makes no direct instantiation of that class,
which can have full 1. abstract methods or 2. combination of implemented and abstract methods or 3. fully implemented methods*/
public abstract class Bill {

    int billAmount = 0;
    boolean isDiscountAvailable = false;
    public int getBill(){
        return billAmount;
    }

    public void setBill(int billAmount){
        this.billAmount = billAmount;
    }

    public abstract void setDiscount();
    public abstract int getDiscount();


}



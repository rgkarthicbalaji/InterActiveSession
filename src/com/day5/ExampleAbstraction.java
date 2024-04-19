package com.day5;

public class ExampleAbstraction {
    public static void main(String[] args) {
        MyEncapsulationClass myEncapsulationClass = new MyEncapsulationClass();
        myEncapsulationClass.setMyInt(10);
        myEncapsulationClass.setMyString("abc");

        System.out.println(myEncapsulationClass.getMyInt());
        System.out.println(myEncapsulationClass.getMyString());

    }
}

package com.day1.num;

import java.util.concurrent.atomic.AtomicLong;

public class NumericEx {
    public static void main(String[] args) {
        Object myMumberObj = new AtomicLong(10);
        //Exception exceptionObj =  new AtomicLong(10);
        System.out.println(myMumberObj.toString());
    }
}

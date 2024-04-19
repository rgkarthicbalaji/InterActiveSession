package com.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopsExample {
    public static void main(String[] args) {
        /*
        1. For
        2. While
        3. do While
        4. Enhanced For loop(Introduced in JDK7)
        5. forEach in JDK 8
         */

        /* For loop has three sections initialization, condition, increment/decrement or call it any action
        1*10 = 10
        2*9 = 18
        3*8 = 24
        ..
        ..
        10*1 = 10
        11*-1 = -11
         */
        //int num=1,tableToMultipy=10;
        for(int num=1,tableToMultipy=10; num<=12; num++,tableToMultipy--){
        //for(;num<=12;) { - This is also valid
            int tenthValue = num * tableToMultipy;
            System.out.println(tenthValue);
            //tableToMultipy--;
            //num++; - perform this incre/decre
        }

        /*
        While loop will have a condition, if that condition is successful then execute the loop
        Provide terminal condition, else it becomes an infinite loop

        int tablesToPrint = 10;
        int i = 1;
        Object bankTransferEvent = new Object();
        while(i<=tablesToPrint){
            System.out.println(i*tablesToPrint);
        }
        */

        int num=1;
        int tableToMultipy = 10;
        while(num<=12){
            System.out.println(num*tableToMultipy);
             //Let loop continue - until it meets a criteria or condition
            /*if(bankTransferEvent.onTransferSuccessful()) {
                break;
            }*/

            System.out.println("Value of num: "+num);
            System.out.println("Value of tableToMultipy: "+tableToMultipy);
            num++;
            tableToMultipy--;

            if(num==11) {
                //Always introduce statements in curly braces to if or else condition
                System.out.println();
                System.out.println();

                System.out.println();
            }
        }

        int numDoWhile=1;
        int tableToMultipyDoWhile = 10;
        do{
            System.out.println("Value of num: "+numDoWhile);
            System.out.println("Value of tableToMultipy: "+tableToMultipyDoWhile);
            System.out.println(numDoWhile+"*"+tableToMultipyDoWhile+"="+numDoWhile*tableToMultipyDoWhile);
            numDoWhile++;
            tableToMultipyDoWhile--;
        }while(numDoWhile<11);


    //Enhanced for loop is introduced in JDK7 used to itererate Array or Collections, it takes care of conditional check and increment
    String[] strArray = {"d","c","b","a"};

        for (String str:strArray) {
            System.out.println(str);
        }

        //ForEach loop - Introduced in JDK8 can be accessed using Stream interface(which is also introduced in JDK8), Stream is available to the instances of Collections
        String[] forEachStrArray = {"abc","bcd","cde","def"};
        Arrays.stream(forEachStrArray).forEach(System.out::println);

        List myNumlist = new ArrayList<Integer>();
        myNumlist.add(100);
        myNumlist.add(101);
        myNumlist.stream().forEach(System.out::println);


    }
}

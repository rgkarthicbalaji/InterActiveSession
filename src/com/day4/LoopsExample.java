package com.day4;

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
            /* Let loop continue - until it meets a criteria or condition
            if(bankTransferEvent.onTransferSuccessful()) {
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
    }
}

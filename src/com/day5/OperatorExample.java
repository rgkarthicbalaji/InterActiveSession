package com.day5;

public class OperatorExample {
    public static void main(String[] args) {

        //Assignment operator
        int a = 10;

        //Numeric Operators - +,-,*,/
        //Boolean Operators -
        // Uniary Operator will perform mathematical AND operation &,| will perform mathematical OR operation
        System.out.println(2&6);
        //2-010
        //6-110(*)
            //----
            //010
            //----
        System.out.println(2|4);

        //Comparision Operator - >,<,==(Only used value check usally for arthimatic value)
        if(100==100){
            System.out.println("Yes it is!");
        }

        //Binary Operator AND & OR are used for boolean check
        if(10>9 && 9<11 && 11>10){
            System.out.println("Now I am getting printed");
        }else if(9>11 || 11<10){
            System.out.println("Now I am not getting printed");
        }

        //Not operator
        if(1!=2){
            System.out.println("Never get printed");
        }

        //Bitwise shift - >> or <<
        System.out.println(2<<2);

        //Ternary operator - Ternary operator is nothing but a if else condition
        int i = 1>2?(3+3):(4+6);
        /*int i;
        if(1>2){
            i = 3+3;
        }else{
            i = 4+6;
        }*/
        System.out.println(i);




    }
}

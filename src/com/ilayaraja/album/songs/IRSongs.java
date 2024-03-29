package com.ilayaraja.album.songs;

public class IRSongs {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float floatVal = 10;
        double doubleVal = 1.0;
        String s = new String("MyName");

        //This is how object for Integer is created from JDK5
        Integer intOldWay = new Integer(10);
        //System.out.print(intOldWay.intValue());

        //Autoboxed from Object to primitive type
        int autoBoxValue = intOldWay;
        //primitive casting
        double autoBoxPrimDoubleValue = intOldWay;
        System.out.println(autoBoxPrimDoubleValue);

        //Narrowing
//        int narrowedDouble = autoBoxPrimDoubleValue;

        //Object based AutoBoxing
        Double autoBoxDoubleObj = Double.valueOf(intOldWay);
        //System.out.println(autoBoxDoubleObj);

        //Autoboxed from Object to primitive type
        Integer autoBoxIntObj = autoBoxValue;
        //System.out.println(autoBoxIntObj.byteValue());

        //int result = squreRoot(floatVal);

        //System.out.println(result);
        IRSongs irSongs = new IRSongs();
        System.out.println(irSongs.pitch(5));
    }

    public float pitch(int i) {
        /*if (i instanceof Integer){
            i = i+10;
        }*/
        return i*i;
    }
}
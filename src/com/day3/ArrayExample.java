package com.day3;

public class ArrayExample {

    /****
     * Arrays are fixed in Size
     * Contains
     * Usage -> Stores multiple variables in single component
     *
     */

    public static void main(String[] args) {

        int[] array = {1, 15, 20};   // Single Dimension Array
        System.out.println("******Array " + array[2]);

        final Integer[][] TwoDimArray = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("******TwoDimensionArray " + TwoDimArray.length);

        final Integer[][][] ThreeDimArray = {{{1, 2, 3}
                //   {4, 5, 6},
                //  {7, 8, 9}}
        } };

        System.out.println("******ThreeDimArray " + ThreeDimArray.length);


        // second way of initialize array
        final int[] externalArray = new int[5];                       // Get approach -> Analyse -> code


        externalArray[0] = 115;
        externalArray[1] = 254;
        externalArray[2] = 378;
        externalArray[3] = 495;
        externalArray[4] = 578;

        // int[] resultArray = new int[5];
        int[] resultArray = new int[externalArray.length];
        System.out.println(" Length of the External array is  " + externalArray.length);
        for (int dimension = 0; dimension < externalArray.length; dimension++) {                         // time complexity o(n)
            resultArray[dimension] = externalArray[dimension] + 100;
        }


        for (int dimension = 0; dimension < externalArray.length; dimension++) {                         // space complexity o(n)
            System.out.println("^^^^^^^^ " + externalArray[dimension]);
        }


    }
}
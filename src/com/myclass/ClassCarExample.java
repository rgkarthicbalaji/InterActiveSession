package com.myclass;

public class ClassCarExample {

    // Class contains properties and behaviours

    // Single line Comment
    /* Multiline Comment */

    /* Properties are called Constants or Variables programmatically
    Behaviour are called Methods programmatically */

    /*Behaviour has two fundamental things setter and getter
    By setting behaviour we are defining the property - which is achieved through setter methods
    By getting behaviour we are accessing the property - which is achieved through getter methods
    */
    final int totalGear = 6;
    int currentGear = 0;

    void setCurrentGearPosition(int gearPosition){
        //totalGear = 10;
        currentGear = gearPosition;
    }

    int getCurrentGearPosition(){
        return currentGear;
    }

    public static void main(String[] args) {
        //Object is Super class of all instances

        //classCarExampleObj is class reference variable

        //Widening
        Object ObjectCar = new ClassCarExample();

        //Narrrowing - In this example narrowing is used to get the precise object, also obviously helps in saving type casting in many references
        ClassCarExample classCarExCastedFromObj = (ClassCarExample) ObjectCar;

        System.out.println("Current Gear position of ObjectCar after narrowing is " + classCarExCastedFromObj.getCurrentGearPosition());

        //Widening again
        Object yes = classCarExCastedFromObj;

        ((ClassCarExample) ObjectCar).setCurrentGearPosition(1);

        System.out.println("Current Gear position of ObjectCar after widening  is " + ((ClassCarExample)yes).getCurrentGearPosition());


        ClassCarExample directCar = new ClassCarExample();
        directCar.setCurrentGearPosition(2);
        System.out.println("Current Gear position of directCar is " + directCar.getCurrentGearPosition());
    }

}

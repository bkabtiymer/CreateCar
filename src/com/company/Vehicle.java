package com.company;

public class Vehicle {

    private String color;
    private String carName;
    private int speed;

    public void setColor(String a)
    {
        color=a;
    }
    public String getColor()
    {
        return color;
    }
    public void setCarName(String b)
    {
        carName=b;
    }
    public String getCarName()
    {
        return carName;
    }
    public void setSpeed(int c)
    {
        speed=c;
    }
    public int getSpeed()
    {
        return speed;
    }


//    public CreateCar()
//    {
//        System.out.println("The red Porsche is initiated ");
//    }
//    public String  start()
//    {
//        return "The red Porsche is starting ";
//    }
//    public String accelerating()
//    {
//        return "The red Porsche is accelerating";
//    }
//    public String fiftyMph()
//    {
//        return "The red Porsche is accelerating";
//    }
//    public String stopped()
//    {
//        return "The red Porsche is accelerating";
//    }
//
//
//

}




///*
// * All Birds are Animals but all Animals are not Birds
// */
//public class Bird extends Animal {
//    public Bird() {
//        //super();
//        System.out.println("A bird is hatched...");
//    }
//
//
//    @Override
//    public String sleep() {
//        return "A bird sleeps soundly...";
//    }
//
//    @Override
//    public String eat() {
//        return "A bird eats...";
//    }
//
//
//    public String fly() {
//        //Birds can fly but other animals can't so this method
//        //is unique to the Bird class
//        return "A bird flies...";
//    }
//}



///*
// * This is the parent class. Also called the super class
// */
//public class Animal {
//    public Animal() {
//        System.out.println("A new animal has been created!");
//    }
//    public String sleep() {
//        return "An animal sleeps...";
//    }
//    public String eat() {
//        return "An animal eats...";
//    }
//}
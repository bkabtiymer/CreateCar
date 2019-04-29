package com.company;

public class CarApp {

    public static void main(String[] args) {
        Car a = new Car();
        a.setColor("red");
        a.getColor();
        a.setCarName("Porsche");
        a.getCarName();
        a.setSpeed(60);
        a.getSpeed();
//        print(a.getSpeed());
        System.out.println();

        print(a.accelarate());
        print(a.stop());

        Car b = new Car();
        b.setColor("blue");
        b.getColor();
        b.setCarName("jetta");
        b.getCarName();
        b.setSpeed(20);

//        print(b.getSpeed());
        a.accelarate();
        a.stop();
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void print(int s) {
        System.out.println(s);
    }
}
package com.company;

public class Car extends Vehicle {
    public String getModel() {
        return super.getCarName();
    }

    public void setModel(String model) {
        super.setCarName(model);
    }

    private String Model;

    @Override
    public void setSpeed(int speed)
    {
        super.setSpeed(speed);
        System.out.print("The speed of "+this.getCarName()+ " is "+getSpeed());
    }

    public Car() {
        super();
        System.out.println("A car is a vehicle ");
    }

    public String start() {
        return "The "+getColor()+this.getCarName() + "has started";
    }

    public String accelarate() {
        return "The "+ getColor()+" "+this.getCarName() + " "+"has accelarated";
    }

    public String stop() {
        return "The "+ getColor()+" "+this.getCarName() +" "+ "has stopped";
    }

}

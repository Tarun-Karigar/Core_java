package com.xworkz.tarun.task1.internal;

public  abstract class Engine extends Vehicle {

    @Override
    public void VehicleColor() {
        System.out.println("The vehicle color is Red");
    }
    public abstract  void NoOfWheels();
}
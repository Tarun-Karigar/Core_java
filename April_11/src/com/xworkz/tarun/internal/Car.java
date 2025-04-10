package com.xworkz.tarun.internal;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road...");
    }

    public void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}

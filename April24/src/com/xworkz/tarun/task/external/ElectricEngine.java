package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Car;

public class ElectricEngine implements Car {
    @Override
    public void start(){
        System.out.println("car is starting in Electric engine ");
    }
}

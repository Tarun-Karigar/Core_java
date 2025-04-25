package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bike;

public class ElectricBike implements Bike {
    @Override
    public void bikeStart(){
        System.out.println("Bike is Starting in Electric mode.......");
    }
}

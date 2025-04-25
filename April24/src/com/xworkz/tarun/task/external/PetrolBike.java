package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Bike;

public class PetrolBike implements Bike {
    @Override
    public void bikeStart(){
        System.out.println("Bike is starting in a Electric Mode");
    }
}

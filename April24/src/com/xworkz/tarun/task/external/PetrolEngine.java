package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Car;

public class PetrolEngine implements Car {
    @Override
    public void start(){
        System.out.println("The car is starting in Petrol engine ");
    }
}

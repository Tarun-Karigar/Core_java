package com.xworkz.tarun.task.external;

import com.xworkz.tarun.task.internal.Car;

public class CarInfo {
    private Car car;
    public CarInfo(Car car){
        this.car=car;
    }
    public void carinfo1(){
        if(car != null){
            System.out.println("Car is running in car info");
        }
        else {
            System.out.println("car is not running in car info ");
        }

    }

}

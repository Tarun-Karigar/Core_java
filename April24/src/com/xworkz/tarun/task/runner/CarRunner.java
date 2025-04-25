package com.xworkz.tarun.task.runner;

import com.xworkz.tarun.task.external.CarInfo;
import com.xworkz.tarun.task.external.ElectricEngine;
import com.xworkz.tarun.task.external.PetrolEngine;
import com.xworkz.tarun.task.internal.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car=new PetrolEngine();
        CarInfo carInfo=new CarInfo(car);
        carInfo.carinfo1();
        car.start();

    }
}

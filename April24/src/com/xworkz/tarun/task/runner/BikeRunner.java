package com.xworkz.tarun.task.runner;

import com.xworkz.tarun.task.external.BikeInfo;
import com.xworkz.tarun.task.external.ElectricBike;
import com.xworkz.tarun.task.internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike=new ElectricBike();
        BikeInfo bikeInfo=new BikeInfo(bike);
        bike.bikeStart();;
        bikeInfo.BikeInformatin();

    }
}

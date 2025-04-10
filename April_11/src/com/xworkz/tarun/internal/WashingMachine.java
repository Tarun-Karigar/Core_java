package com.xworkz.tarun.internal;

public class WashingMachine extends Appliance {
    @Override
    public void start() {
        System.out.println("Washing machine is starting wash cycle...");
    }

    public void rinse() {
        System.out.println("Washing machine is rinsing clothes.");
    }
}

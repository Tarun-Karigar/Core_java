package com.xworkz.tarun.internal;

class DeliveryDrone extends Drone {
    @Override
    public void fly() {
        System.out.println("Delivery drone is flying to a GPS location.");
    }

    public void dropPackage() {
        System.out.println("Package dropped successfully!");
    }
}

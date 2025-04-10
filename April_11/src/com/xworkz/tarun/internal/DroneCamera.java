package com.xworkz.tarun.internal;

public class DroneCamera extends Camera {
    @Override
    public void shoot() {
        System.out.println("Capturing aerial shots using drone...");
    }

    public void hover() {
        System.out.println("Drone hovering over the set.");
    }
}

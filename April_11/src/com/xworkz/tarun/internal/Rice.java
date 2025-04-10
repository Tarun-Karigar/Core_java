package com.xworkz.tarun.internal;

public class Rice extends Crop {
    @Override
    public void grow() {
        System.out.println("Rice grows in wet soil...");
    }
    public void harvest() {
        System.out.println("Harvesting the rice using combine harvester...");
    }
}
package com.xworkz.tarun.internal;

public class SolarPanel extends EnergySource {
    @Override
    public void generate() {
        System.out.println("Generating energy from sunlight...");
    }
    public void store() {
        System.out.println("Storing energy in batteries...");
    }
}

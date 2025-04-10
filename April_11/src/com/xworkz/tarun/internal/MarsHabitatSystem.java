package com.xworkz.tarun.internal;

class MarsHabitatSystem extends HabitatSystem {
    @Override
    public void monitor() {
        System.out.println("Monitoring oxygen, pressure, and temperature on Mars.");
    }

    public void recycleAir() {
        System.out.println("Recycling CO2 into breathable air.");
    }
}
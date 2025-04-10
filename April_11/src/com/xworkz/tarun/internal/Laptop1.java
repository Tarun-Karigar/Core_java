package com.xworkz.tarun.internal;

class Laptop1 extends Computer {
    @Override
    public void start() {
        System.out.println("Laptop is booting up.");
    }

    public void batteryStatus() {
        System.out.println("Battery at 85%");
    }
}
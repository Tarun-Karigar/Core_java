package com.xworkz.tarun.internal;

public class Laptop extends Device {
    @Override
    public void start() {
        System.out.println("Laptop is booting up with Windows...");
    }

    public void runProgram() {
        System.out.println("Running a Java program on the laptop...");
    }
}

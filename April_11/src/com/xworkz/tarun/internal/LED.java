package com.xworkz.tarun.internal;

public class LED extends Light {
    @Override
    public void glow() {
        System.out.println("LED lights glow with energy efficiency.");
    }

    public void savePower() {
        System.out.println("LEDs help in reducing electricity usage.");
    }
}
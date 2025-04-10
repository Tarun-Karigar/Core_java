package com.xworkz.tarun.internal;

public class DentalClinic extends Hospital {
    @Override
    public void service() {
        System.out.println("Providing dental check-ups.");
    }

    public void cleanTeeth() {
        System.out.println("Performing teeth cleaning.");
    }
}

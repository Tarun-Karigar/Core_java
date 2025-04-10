package com.xworkz.tarun.internal;

public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Strumming the guitar...");
    }

    public void tune() {
        System.out.println("Tuning the guitar...");
    }
}

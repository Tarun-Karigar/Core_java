package com.xworkz.tarun.internal;

public class MarbleSculpture extends Sculpture {
    @Override
    public void shape() {
        System.out.println("Carving a sculpture out of marble.");
    }

    public void polish() {
        System.out.println("Polishing the marble surface.");
    }
}

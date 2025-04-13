package com.xworkz.tarun.internal;

public class DigitalAccount extends Account {
    public void autoLogin() {
        System.out.println("Performing automatic login for DigitalAccount.");
    }

    // Extra method "add" provided by this subclass
    public void add() {
        System.out.println("DigitalAccount add method invoked.");
    }
}

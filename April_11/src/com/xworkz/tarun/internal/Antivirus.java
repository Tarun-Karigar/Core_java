package com.xworkz.tarun.internal;


public class Antivirus extends Software {
    @Override
    public void run() {
        System.out.println("Antivirus is scanning for threats.");
    }

    public void updateDatabase() {
        System.out.println("Virus definitions updated.");
    }
}

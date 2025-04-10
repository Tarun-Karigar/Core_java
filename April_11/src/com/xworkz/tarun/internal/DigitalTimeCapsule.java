package com.xworkz.tarun.internal;

class DigitalTimeCapsule extends TimeCapsule {
    @Override
    public void store() {
        System.out.println("Storing digital memories with timestamp.");
    }

    public void encrypt() {
        System.out.println("Encrypting stored data.");
    }
}

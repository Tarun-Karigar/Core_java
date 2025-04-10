package com.xworkz.tarun.internal;

class SmartBillboard extends Billboard {
    @Override
    public void showAd() {
        System.out.println("Displaying dynamic ad based on crowd analysis.");
    }

    public void detectAudience() {
        System.out.println("Detecting audience age and gender.");
    }
}
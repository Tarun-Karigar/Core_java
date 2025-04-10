package com.xworkz.tarun.internal;

class AdvancedSeismograph extends Seismograph {
    @Override
    public void detect() {
        System.out.println("Detecting magnitude and epicenter of earthquake.");
    }

    public void alertSystem() {
        System.out.println("Sending emergency alerts to nearby cities.");
    }
}
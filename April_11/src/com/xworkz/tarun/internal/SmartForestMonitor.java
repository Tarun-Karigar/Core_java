package com.xworkz.tarun.internal;
class SmartForestMonitor extends ForestMonitor {
    @Override
    public void scan() {
        System.out.println("Detecting illegal logging using drone scans.");
    }

    public void alertAuthorities() {
        System.out.println("Alert sent to forest rangers.");
    }
}

package com.xworkz.tarun.internal;

public class SuspensionBridge extends Bridge {
    @Override
    public void support() {
        System.out.println("Suspension bridge supports weight using cables.");
    }

    public void sway() {
        System.out.println("Suspension bridges sway slightly in wind.");
    }
}

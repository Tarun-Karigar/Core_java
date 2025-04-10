package com.xworkz.tarun.internal;

public class SpaceX extends Rocket {
    @Override
    public void launch() {
        System.out.println("SpaceX rocket launching with reusable technology.");
    }

    public void land() {
        System.out.println("SpaceX rocket landed successfully.");
    }
}

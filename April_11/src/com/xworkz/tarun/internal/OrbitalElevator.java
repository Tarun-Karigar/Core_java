package com.xworkz.tarun.internal;

class OrbitalElevator extends SpaceElevator {
    @Override
    public void move() {
        System.out.println("Elevator is moving toward orbital station.");
    }

    public void stabilize() {
        System.out.println("Stabilizing the cable structure.");
    }
}

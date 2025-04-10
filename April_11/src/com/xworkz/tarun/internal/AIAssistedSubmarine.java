package com.xworkz.tarun.internal;

class AIAssistedSubmarine extends Submarine {
    @Override
    public void dive() {
        System.out.println("AI controlling submarine depth levels.");
    }

    public void detectObjects() {
        System.out.println("Sonar detects object 300m ahead.");
    }
}
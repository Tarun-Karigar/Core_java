package com.xworkz.tarun.internal;

class Commander extends Astronaut {
    @Override
    public void mission() {
        System.out.println("Commander is leading the Mars mission.");
    }

    public void giveCommand() {
        System.out.println("Commander gives docking instructions.");
    }
}

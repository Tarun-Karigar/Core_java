package com.xworkz.tarun.internal;

public class ActionFilm extends Film {
    @Override
    public void play() {
        System.out.println("Explosions and fight scenes in action film!");
    }

    public void stuntSequence() {
        System.out.println("Performing high-risk stunts.");
    }
}
package com.xworkz.tarun.internal;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball...");
    }
}

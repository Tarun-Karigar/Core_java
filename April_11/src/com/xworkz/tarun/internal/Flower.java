package com.xworkz.tarun.internal;

class Flower extends Plant {
    @Override
    public void grow() {
        System.out.println("Flower is blooming.");
    }

    public void fragrance() {
        System.out.println("Smells sweet.");
    }
}
package com.xworkz.tarun.internal;

class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying in circles.");
    }

    public void speak() {
        System.out.println("Parrot says Hello!");
    }
}
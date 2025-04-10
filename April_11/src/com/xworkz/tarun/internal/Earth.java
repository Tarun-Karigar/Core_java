package com.xworkz.tarun.internal;

class Earth extends Planet {
    @Override
    public void orbit() {
        System.out.println("Earth completes one orbit in 365 days.");
    }

    public void supportLife() {
        System.out.println("Earth supports diverse life forms.");
    }
}

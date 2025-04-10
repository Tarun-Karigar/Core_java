package com.xworkz.tarun.internal;

class Hammer extends Tool {
    @Override
    public void use() {
        System.out.println("Using hammer to fix nails.");
    }

    public void weight() {
        System.out.println("Weight: 1.5kg");
    }
}

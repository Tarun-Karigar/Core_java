package com.xworkz.tarun.internal;

public class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code...");
    }

    public void debug() {
        System.out.println("Developer is debugging the application...");
    }
}

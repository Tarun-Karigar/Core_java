package com.xworkz.tarun.internal;

public class Doctor extends Profession {
    @Override
    public void work() {
        System.out.println("Doctor is treating a patient...");
    }

    public void prescribe() {
        System.out.println("Doctor is prescribing medicine...");
    }
}

package com.xworkz.tarun.internal;

public class EPassport extends Passport {
    @Override
    public void apply() {
        System.out.println("Applying for an e-passport online...");
    }
    public void verify() {
        System.out.println("Verifying e-passport using biometrics...");
    }
}


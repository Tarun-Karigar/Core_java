package com.xworkz.tarun.internal;

class BiometricLock extends DoorLock {
    @Override
    public void unlock() {
        System.out.println("Unlocking with fingerprint...");
    }

    public void scanFingerprint() {
        System.out.println("Scanning fingerprint for authentication.");
    }
}

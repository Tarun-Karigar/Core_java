package com.xworkz.tarun.internal;

class Smartphone extends Phone {
    @Override
    public void ring() {
        System.out.println("Smartphone has a custom ringtone.");
    }

    public void camera() {
        System.out.println("Camera: 64MP");
    }
}
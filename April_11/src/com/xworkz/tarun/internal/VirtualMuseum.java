package com.xworkz.tarun.internal;

class VirtualMuseum extends Museum {
    @Override
    public void tour() {
        System.out.println("Taking a 360° virtual museum tour.");
    }

    public void showArtwork() {
        System.out.println("Displaying digital artwork in high resolution.");
    }
}

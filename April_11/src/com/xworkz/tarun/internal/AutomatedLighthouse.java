package com.xworkz.tarun.internal;

class AutomatedLighthouse extends Lighthouse {
    @Override
    public void signal() {
        System.out.println("Automated lighthouse sends signals using AI control.");
    }

    public void detectShips() {
        System.out.println("Detected a ship within 3 nautical miles.");
    }
}


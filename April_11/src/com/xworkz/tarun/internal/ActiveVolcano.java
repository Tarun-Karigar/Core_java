package com.xworkz.tarun.internal;

class ActiveVolcano extends Volcano {
    @Override
    public void erupt() {
        System.out.println("Active volcano is erupting with lava!");
    }

    public void releaseGas() {
        System.out.println("Releasing sulfur gases into the atmosphere.");
    }
}

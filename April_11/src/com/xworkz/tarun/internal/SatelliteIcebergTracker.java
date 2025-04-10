package com.xworkz.tarun.internal;

class SatelliteIcebergTracker extends Iceberg {
    @Override
    public void drift() {
        System.out.println("Tracking iceberg via satellite imaging.");
    }

    public void predictPath() {
        System.out.println("Predicting iceberg path using ocean current data.");
    }
}

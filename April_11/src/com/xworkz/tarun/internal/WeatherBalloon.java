package com.xworkz.tarun.internal;

class WeatherBalloon extends Balloon {
    @Override
    public void floatUp() {
        System.out.println("Weather balloon rising to collect atmosphere data.");
    }

    public void collectData() {
        System.out.println("Collecting temperature and pressure data.");
    }
}

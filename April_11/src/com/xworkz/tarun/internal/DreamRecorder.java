package com.xworkz.tarun.internal;

class DreamRecorder extends DreamDevice {
    @Override
    public void record() {
        System.out.println("Recording REM sleep dream visuals...");
    }

    public void playback() {
        System.out.println("Playing back dream in VR.");
    }
}
package com.xworkz.tarun.internal;

class SmartTrashCan extends TrashCan {
    @Override
    public void open() {
        System.out.println("Automatically opening the trash can using sensor.");
    }

    public void compressWaste() {
        System.out.println("Compressing waste to save space.");
    }
}

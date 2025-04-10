package com.xworkz.tarun.internal;

class DinosaurFossil extends Fossil {
    @Override
    public void age() {
        System.out.println("This dinosaur fossil is 65 million years old.");
    }

    public void species() {
        System.out.println("Species: Tyrannosaurus Rex");
    }
}
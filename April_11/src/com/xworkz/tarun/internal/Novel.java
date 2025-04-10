package com.xworkz.tarun.internal;

class Novel extends Book {
    @Override
    public void info() {
        System.out.println("This is a fiction novel.");
    }

    public void genre() {
        System.out.println("Genre: Mystery");
    }
}


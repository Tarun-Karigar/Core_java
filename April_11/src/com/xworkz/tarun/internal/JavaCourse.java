package com.xworkz.tarun.internal;

class JavaCourse extends Course {
    @Override
    public void details() {
        System.out.println("Java course - Intermediate level.");
    }

    public void duration() {
        System.out.println("Duration: 2 months.");
    }
}
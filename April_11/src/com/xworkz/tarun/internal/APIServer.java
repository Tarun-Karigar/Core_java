package com.xworkz.tarun.internal;

public class APIServer extends Server {
    @Override
    public void respond() {
        System.out.println("Responding with JSON data...");
    }
    public void authenticate() {
        System.out.println("Authenticating API request...");
    }
}
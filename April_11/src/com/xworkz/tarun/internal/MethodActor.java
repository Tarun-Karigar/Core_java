package com.xworkz.tarun.internal;

public class MethodActor extends Actor {
    @Override
    public void perform() {
        System.out.println("Getting deep into the character's psyche.");
    }

    public void stayInCharacter() {
        System.out.println("Remaining in role off-screen too.");
    }
}
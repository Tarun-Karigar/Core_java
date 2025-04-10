package com.xworkz.tarun.internal;

public class AncientRelic extends Treasure {
    @Override
    public void discover() {
        System.out.println("An ancient relic from a lost civilization was discovered.");
    }

    public void preserve() {
        System.out.println("Preserving the relic in a museum.");
    }
}

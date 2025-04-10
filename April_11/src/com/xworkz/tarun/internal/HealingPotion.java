package com.xworkz.tarun.internal;

class HealingPotion extends Potion {
    @Override
    public void mix() {
        System.out.println("Mixing herbs and magic dust for healing.");
    }

    public void heal() {
        System.out.println("Healed 50 health points!");
    }
}

package com.xworkz.tarun.internal;

public class VeganRecipe extends Recipe {
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious vegan recipe.");
    }

    public void addToCookbook() {
        System.out.println("Vegan recipe added to cookbook.");
    }
}

package com.xworkz.tarun.internal;

public class Dish_main {
    public static void main(String[] args) {
        Dish dish = new Dish();
        Dish.SideDish sideDish = dish.new SideDish(); // Inner class
        Dish.SideDish.Omlet omlet = sideDish.new Omlet(); // Nested inner class

        System.out.println(omlet.describe());
    }
}

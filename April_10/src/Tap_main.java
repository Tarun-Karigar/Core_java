package com.xworkz.tarun.internal;

public class Tap_main {
    public static void main(String[] args) {
        Tap tap = new Tap();
        Tap.Acadamy acadamy = tap.new Acadamy(); // Create Acadamy object
        Tap.Acadamy.Organization organization = acadamy.new Organization(); // Create Organization object

        System.out.println(organization.describe());
    }
}

package com.xworkz.tarun.exceptions;

public class Name_start extends RuntimeException {
    public static void main(String[] args) {
        String name = "Tarun";
        if (name.charAt(0) >= '0' && name.charAt(0) <= '9') {
            throw new Exceptionscls("Name should not start with a number.");
        }
        else {
            System.out.println("Name is valid ");
        }

    }
}


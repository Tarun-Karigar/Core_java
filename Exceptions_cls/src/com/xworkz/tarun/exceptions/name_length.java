package com.xworkz.tarun.exceptions;

public class name_length extends RuntimeException {
    public static void main(String[] args) {
        String name="abcd";
        if(name.length()<3){
            throw new Exceptionscls("The lenth of the name should be  less than 3 ");
        }
        else {
            System.out.println("The length of the name is more than 3 ");
        }
    }
}

package com.xworkz.tarun.exceptions;

public class Aadharnum extends RuntimeException{
    public static void main(String[] args) {
      String  aadharnum="123456789" ;
        if (aadharnum.length()<12 || aadharnum.length()>12){
            System.out.println("The length of the Aadhar number is less than or greater than 12");
        }
        else {
            System.out.println("The length of the aadhar  number is 12");
        }
    }
}

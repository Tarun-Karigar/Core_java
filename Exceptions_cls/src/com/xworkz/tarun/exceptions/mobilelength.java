package com.xworkz.tarun.exceptions;

public class mobilelength extends RuntimeException{
    public static void main(String[] args) {
       String mobilenum ="1234567891";
        if (mobilenum.length()<10 || mobilenum.length()>10){
            throw new Exceptionscls("the length of the mobile number is less than 10 or greater than 10");
        }
        else {
            System.out.println("the lenghth of the mobile number is 10");
        }
    }
}

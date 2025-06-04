package com.xworkz.tarun.exceptions;

public class emailcomcheck extends RuntimeException {
    public static void main(String[] args) {
        String email="tarunkarigar9@gmail.com";
        if(!email.contains(".com")){
            throw new Exceptionscls("The email doesnt end with .com");
        }
        else {
            System.out.println("the email ends with .com");
        }
    }
}

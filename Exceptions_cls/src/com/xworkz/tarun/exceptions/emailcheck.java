package com.xworkz.tarun.exceptions;

public class emailcheck extends RuntimeException {
    public static void main(String[] args) {
       String email="tarunkarigar9@gmail.com";
        if(!email.contains("@")){
            throw new Exceptionscls("The email doesnt contain @ symbol");
        }
        else {
            System.out.println("the email contains the @");
        }
    }
}

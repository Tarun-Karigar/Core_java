package com.xworkz.tarun.exceptions;

public class password_check extends RuntimeException{
    public static void main(String[] args) {
        String password="123456";
        if (password.length()<8 || password.length()>16){
            throw new Exceptionscls("the length of the password is not sufficient");
        }
        else{
            System.out.println("the lenghth of the password is sufficient");
        }
    }
}

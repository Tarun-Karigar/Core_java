package com.xworkz.tarun.exceptions;

public class adress extends RuntimeException{
    public static void main(String[] args) {
        String adress="hi i am tarun";
        if(adress==null){
            throw new Exceptionscls("The Adress is null which is invalid input");
        }
        else {
            System.out.println("The adress is not null");
        }
    }
}

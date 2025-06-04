package com.xworkz.tarun.exceptions;

public class country extends RuntimeException{
  public static void main(String[] args) {
    String country="India";
    if (country.contains("India")){
      throw new Exceptionscls("The country is not India");
    }
    else {
      System.out.println("The Country is india ");
    }
  }
}

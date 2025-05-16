package com.xworkz.tarun.task1;

public class String1 {
    public static void main(String[] args) {
       String input1="RCB will win  the match ";
       String input2= input1.substring(0,9);
       String reverse1=input1.substring(9,13);
        String reversed = new StringBuilder(reverse1).reverse().toString();
        String reverse2=input1.substring(14,18);
        String reversed2 = new StringBuilder(reverse2).reverse().toString();
        String input3= input1.substring(17,23);
        System.out.println(input2+ reversed+ reversed2+ input3);
    }
}

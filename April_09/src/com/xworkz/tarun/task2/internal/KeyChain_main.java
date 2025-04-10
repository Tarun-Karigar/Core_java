package com.xworkz.tarun.task2.internal;

public class KeyChain_main {
    public static void main(String[] args) {

    Keychain keychain=new Keychain();
    keychain.setName("Green");
    keychain.setCost(21);
    keychain.setTheme("Animal");
    keychain.setdisc(10);
        System.out.println("The keychain Color is  "+keychain.getName());
        System.out.println("The kechain cost is "+keychain.getCost());
        System.out.println("The kechain Theme is "+keychain.getTheme());
        System.out.println("The kechain discount  is "+keychain.getdisc());
}
}

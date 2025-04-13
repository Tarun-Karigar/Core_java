package com.xworkz.tarun.task3.external;

public class TeaShop {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account1();
        Account acc2 = new Account2();
        Account acc3 = new Account3();
        Account base = new Account();

        bank.process(acc1); // Will call Account1 methods
        bank.process(acc2); // Will call Account2 methods
        bank.process(acc3); // Will call Account3 methods
        bank.process(base); // Just base method
    }
}
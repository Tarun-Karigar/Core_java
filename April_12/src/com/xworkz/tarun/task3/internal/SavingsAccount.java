package com.xworkz.tarun.task3.internal;

class Bank {
    public void process(Account account) {
        if (account == null) {
            System.err.println("Account is null.");
            return;
        }

        account.credentials();

        if (account instanceof Account1) {
            ((Account1) account).extraFeature1();
        } else if (account instanceof Account2) {
            ((Account2) account).extraFeature2();
        } else if (account instanceof Account3) {
            ((Account3) account).extraFeature3();
        }
        // ... Repeat until Account100
        else {
            System.out.println("No specific feature found for this account type.");
        }
    }
}
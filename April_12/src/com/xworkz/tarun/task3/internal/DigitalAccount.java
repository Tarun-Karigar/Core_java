package com.xworkz.tarun.task3.internal;

class Account1 extends Account {
    @Override
    public void credentials() {
        System.out.println("Account1 credentials.");
    }

    public void extraFeature1() {
        System.out.println("Account1 feature.");
    }
}

class Account2 extends Account {
    @Override
    public void credentials() {
        System.out.println("Account2 credentials.");
    }

    public void extraFeature2() {
        System.out.println("Account2 feature.");
    }
}

class Account3 extends Account {
    @Override
    public void credentials() {
        System.out.println("Account3 credentials.");
    }

    public void extraFeature3() {
        System.out.println("Account3 feature.");
    }
}

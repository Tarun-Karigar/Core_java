package com.xworkz.tarun.internal;

public class PremiumSubscription extends Subscription {
    @Override
    public void activate() {
        System.out.println("Activating premium features...");
    }
    public void renew() {
        System.out.println("Renewing subscription automatically...");
    }
}

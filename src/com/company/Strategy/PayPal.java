package com.company.Strategy;

public class PayPal implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("You are paying with PayPal.");
    }
}

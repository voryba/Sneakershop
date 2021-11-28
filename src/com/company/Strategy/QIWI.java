package com.company.Strategy;

public class QIWI implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("You are paying with qiwi.");
    }
}

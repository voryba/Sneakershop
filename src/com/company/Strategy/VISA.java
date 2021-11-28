package com.company.Strategy;

public class VISA implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("You are paying with visa card.");
    }
}

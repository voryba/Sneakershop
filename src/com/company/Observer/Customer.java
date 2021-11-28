package com.company.Observer;

import com.company.Strategy.PayStrategy;

import java.util.ArrayList;

public class Customer implements Observer{

    private String name;

    @Override
    public void update(ArrayList<Observer> customer) {
        System.out.println("[NOTIFICATION] " + name +" has been added to the list of available products"+"\n"+customer);
    }
    //    block for decorator pattern
    private PayStrategy payStrategy;
    public void performPay(){
        payStrategy.pay();
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public Customer(String name) {
        this.name = name;
    }
    public Customer(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", payStrategy=" + payStrategy +
                '}';
    }
}

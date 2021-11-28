package com.company.Observer;

import java.util.ArrayList;

public class Shop implements  Observable{

    private ArrayList<Observer> customers=new ArrayList<>();

    @Override
    public void addCustomer(Observer customer) {
        this.customers.add(customer);
        sendNotifications(customers);
    }

    private void sendNotifications(ArrayList<Observer> sneakers){
        for (Observer sneaker: this.customers){
            sneaker.update(sneakers);
        }
    }
}

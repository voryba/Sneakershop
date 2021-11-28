package com.company.Adapter;

public class AdapterImplementation implements PriceAdapter{

    Price price;

    public AdapterImplementation(Price price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return convertDollarToKzt(price.getPrice());
    }

    private double convertDollarToKzt(double dollar){
        return dollar*433.3;
    }
}

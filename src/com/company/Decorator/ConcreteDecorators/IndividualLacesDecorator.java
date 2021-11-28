package com.company.Decorator.ConcreteDecorators;

import com.company.Adapter.Price;
import com.company.Decorator.ItemDecorator;
import com.company.Factory.Sneaker;

public class IndividualLacesDecorator extends ItemDecorator {

    public IndividualLacesDecorator(Sneaker price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    protected void getSneaker() {

    }

    @Override
    public String draw() {
        return null;
    }
}

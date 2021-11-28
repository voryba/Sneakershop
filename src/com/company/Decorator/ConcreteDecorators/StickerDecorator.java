package com.company.Decorator.ConcreteDecorators;

import com.company.Adapter.Price;
import com.company.Decorator.ItemDecorator;
import com.company.Factory.Sneaker;

public class StickerDecorator extends ItemDecorator {
    public StickerDecorator(Sneaker price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 70;
    }

    @Override
    protected void getSneaker() {

    }

    @Override
    public String draw() {
        return null;
    }
}

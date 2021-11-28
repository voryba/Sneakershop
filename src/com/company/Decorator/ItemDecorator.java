package com.company.Decorator;

import com.company.Adapter.Price;
import com.company.Factory.Sneaker;

public abstract class ItemDecorator extends Sneaker {
    private Sneaker price;

    public ItemDecorator(Sneaker price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price.getPrice();
    }
}

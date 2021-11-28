package com.company.Factory;

import com.company.Bridge.SneakersColor;

public class Adidas extends Sneaker {
    @Override
    public void getSneaker() {
        System.out.println("You have chosen the Adidas brand");
    }

    @Override
    public String draw() {
        return "Sneakers are drawn. " +sneakersColor.fill();
    }

    @Override
    public double getPrice() {
        return 200;
    }

    public Adidas(SneakersColor sneakersColor) {
        super(sneakersColor);
    }

    public Adidas() {
    }
}

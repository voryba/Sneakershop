package com.company.Factory;

import com.company.Bridge.SneakersColor;

public class Nike extends Sneaker {
    @Override
    public void getSneaker() {
        System.out.println("You have chosen the Nike brand");
    }

    @Override
    public String draw() {
        return "Sneakers are drawn. " + sneakersColor.fill();
    }

    @Override
    public double getPrice() {
        return 300;
    }

    public Nike(SneakersColor sneakersColor) {
        super(sneakersColor);
    }

    public Nike() {
    }
}

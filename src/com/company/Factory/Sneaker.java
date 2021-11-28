package com.company.Factory;

import com.company.Adapter.Price;
import com.company.Bridge.SneakersColor;

public abstract class Sneaker implements Price {
    SneakersColor sneakersColor;

    public Sneaker(SneakersColor sneakersColor) {
        this.sneakersColor = sneakersColor;
    }

    public Sneaker() {
    }

    protected abstract void getSneaker();
    abstract public String draw();


}

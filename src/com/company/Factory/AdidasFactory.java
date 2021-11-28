package com.company.Factory;

public class AdidasFactory implements SneakerFactory {
    @Override
    public Sneaker createSneaker() {
        return new Adidas();
    }
}

package com.company.Factory;

public class NikeFactory implements SneakerFactory {

    @Override
    public Sneaker createSneaker() {
        return new Nike();
    }
}

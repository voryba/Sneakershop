package com.company;


import com.company.Adapter.AdapterImplementation;
import com.company.Adapter.PriceAdapter;
import com.company.Bridge.CyanSneakers;
import com.company.Decorator.ConcreteDecorators.IndividualLacesDecorator;
import com.company.Decorator.ConcreteDecorators.StickerDecorator;
import com.company.Factory.Nike;
import com.company.Factory.NikeFactory;
import com.company.Factory.Sneaker;
import com.company.Factory.SneakerFactory;
import com.company.Observer.Customer;
import com.company.Observer.Shop;
import com.company.Strategy.PayPal;
import com.company.Strategy.QIWI;
import com.company.Strategy.VISA;

public class Main {
    public static void main(String[] args) {
        // ABSTRACT FACTORY
        SneakerFactory sneakerFactory = new NikeFactory();

        Sneaker sneaker = sneakerFactory.createSneaker();
        System.out.println("Sneakers price without any decorator:");
        System.out.println(sneaker.getPrice());

        // DECORATOR
        System.out.println("DECORATOR PATTERN -----------------------------------------------------------");
        System.out.println("Price with individual laces and sticker:");
        sneaker = new IndividualLacesDecorator(new StickerDecorator(new Nike()));

        System.out.println(sneaker.getPrice());
        System.out.println("ADAPTER PATTERN -----------------------------------------------------------");
        // ADAPTER

        PriceAdapter priceAdapter = new AdapterImplementation(sneaker);
        System.out.println(sneaker.getPrice() + " $ to KZT:");
        System.out.println(priceAdapter.getPrice() + " KZT");

        // BRIDGE

        System.out.println("BRIDGE PATTERN -----------------------------------------------------------");
        sneaker = new Nike(new CyanSneakers());
        System.out.println(sneaker.draw());


        // OBSERVER

        Shop sneakerShop = new Shop();

        Customer emp1 = new Customer("Yerkhan Sabyrov");
        Customer emp2 = new Customer("Toishybek Olzhas");
        Customer emp3 = new Customer("Tursynbek IQos");
            // STRATEGY

            emp1.setPayStrategy(new QIWI());
            emp2.setPayStrategy(new PayPal());
            emp2.setPayStrategy(new VISA());

        sneakerShop.addCustomer(emp1);
        sneakerShop.addCustomer(emp2);
        sneakerShop.addCustomer(emp3);
        


    }
}

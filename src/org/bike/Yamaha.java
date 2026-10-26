package org.bike;

public class Yamaha implements Bike{
    @Override
    public void cost() {
        System.out.println("This Yamaha Bike Cost is 800000");
    }

    @Override
    public void speed() {
        System.out.println("This Yamaha Bike Cost is 1000");
    }
}

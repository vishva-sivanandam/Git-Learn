package org.bike;

public class Bajaj implements Bike{
    @Override
    public void cost() {
        System.out.println("This Bajaj Bike Cost is 1500000");
    }

    @Override
    public void speed() {
        System.out.println("This Bajaj Bike Cost is 500");
    }
}

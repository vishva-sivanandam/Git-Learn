package org.bike;

public class Suzuki implements Bike{
    @Override
    public void cost() {
        System.out.println("This Suzuki Bike Cost is 500000");
    }

    @Override
    public void speed() {
        System.out.println("The Suzuki Bike Speed is 200");
    }
}

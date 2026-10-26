package org.bike;

public class BikeShowRoom {
    public static void main(String[] args) {
        Bike bikeBajaj = new Bajaj();
        bikeBajaj.cost();
        bikeBajaj.speed();
        System.out.println("\n-------------");
        Bike bikeSuzuki = new Suzuki();
        bikeSuzuki.speed();
        bikeSuzuki.cost();
    }
}

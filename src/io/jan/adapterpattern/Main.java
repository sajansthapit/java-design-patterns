package io.jan.adapterpattern;

public class Main {
    public static void main(String[] args) {
       Sparrow sparrow = new Sparrow();
       sparrow.fly();
       sparrow.makeSound();

       PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
       plasticToyDuck.squeak();

       ToyDuck duckWithSound = new BirdAdapter(sparrow);
       duckWithSound.squeak();

    }
}

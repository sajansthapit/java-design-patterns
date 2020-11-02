package io.jan.adapterpattern;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Plastic Toy duck squeaking");
    }
}

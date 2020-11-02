package io.jan.builderpattern.example1;

public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizza = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizza);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.getPizza());
    }
}

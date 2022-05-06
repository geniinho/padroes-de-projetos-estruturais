package br.com.cod3r.decorator.coffeeShop.model;

public class Coke implements Drink {
    @Override
    public void serve() {
        System.out.println("- Adding 350ml of Coke");
    }

    @Override
    public Double getPrice() {
        return 3.5d;
    }
}

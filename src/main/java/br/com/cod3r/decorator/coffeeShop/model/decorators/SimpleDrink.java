package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public class SimpleDrink extends DrinkDecorator {
    public SimpleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice();
    }
}

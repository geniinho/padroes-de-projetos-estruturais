package br.com.cod3r.decorator.coffeeShop;

import br.com.cod3r.decorator.coffeeShop.model.Coke;
import br.com.cod3r.decorator.coffeeShop.model.Drink;
import br.com.cod3r.decorator.coffeeShop.model.Expresso;
import br.com.cod3r.decorator.coffeeShop.model.Tea;
import br.com.cod3r.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.cod3r.decorator.coffeeShop.model.decorators.Milk;
import br.com.cod3r.decorator.coffeeShop.model.decorators.SimpleDrink;

public class Client {


	
	public static void order(String name, Drink drink) {

		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
		order("Negão duplo",new DoubleDrink(new Expresso()));
		order("Negão duplo com leite", new DoubleDrink(new Milk(new Expresso())));
		order("Coquinha geladinha uiuiui",new SimpleDrink(new Coke()));

	}
}

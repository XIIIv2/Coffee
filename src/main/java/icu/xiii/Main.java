package icu.xiii;

import icu.xiii.service.CoffeeService;
import icu.xiii.view.CoffeeMachine;

public class Main {

    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addDrink("Espresso");
        coffeeMachine.addDrink("Cappuccino");
        coffeeMachine.addDrink("Latte");

        coffeeMachine.displayMenu();
        coffeeService.setCoffeeMaker(coffeeMachine.chooseCoffee());
        coffeeService.makeCoffee();
    }
}

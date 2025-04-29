package icu.xiii;

import icu.xiii.entity.CappuccinoCoffeeMaker;
import icu.xiii.entity.EspressoCoffeeMaker;
import icu.xiii.entity.LatteCoffeeMaker;
import icu.xiii.service.CoffeeService;
import icu.xiii.view.CoffeeMachine;

public class Main {

    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addDrink(1, new EspressoCoffeeMaker());
        coffeeMachine.addDrink(2, new CappuccinoCoffeeMaker());
        coffeeMachine.addDrink(3, new LatteCoffeeMaker());

        coffeeMachine.displayMenu();
        coffeeService.setCoffeeMaker(coffeeMachine.chooseCoffee());
        coffeeService.makeCoffee();
    }
}

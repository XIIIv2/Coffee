package icu.xiii.service;

import icu.xiii.entity.CoffeeMaker;

public class CoffeeService {

    private CoffeeMaker coffeeMaker;

    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void makeCoffee() {
        System.out.println(this.coffeeMaker.make());
    }
}

package icu.xiii.entity;

public class CappuccinoCoffeeMaker implements CoffeeMaker {

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public String make() {
        return "Your " + getName() + ". Enjoy :)";
    }
}

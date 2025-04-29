package icu.xiii.entity;

public class LatteCoffeeMaker implements CoffeeMaker {

    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public String make() {
        return "Your " + getName() + ". Enjoy :)";
    }
}

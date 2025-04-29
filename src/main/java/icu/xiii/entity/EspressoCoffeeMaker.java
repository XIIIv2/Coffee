package icu.xiii.entity;

public class EspressoCoffeeMaker implements CoffeeMaker {

    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public String make() {
        return "Your " + getName() + ". Enjoy :)";
    }
}

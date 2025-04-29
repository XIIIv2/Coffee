package icu.xiii.entity;

public interface CoffeeMaker {

    String getName();

    default String make() {
        return "Your " + getName() + ". Enjoy :)";
    }
}

package icu.xiii.view;

import icu.xiii.entity.CappuccinoCoffeeMaker;
import icu.xiii.entity.CoffeeMaker;
import icu.xiii.entity.EspressoCoffeeMaker;
import icu.xiii.entity.LatteCoffeeMaker;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {

    private final Map<Integer, CoffeeMaker> drinks = new HashMap<>();

    public void addDrink(int id, CoffeeMaker coffeeMaker) {
        drinks.putIfAbsent(id, coffeeMaker);
    }

    public void removeDrink(int id) {
        drinks.remove(id);
    }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Choose a drink:\n");
        this.drinks.forEach((k, v) -> {
            sb.append(k)
                    .append(" - ")
                    .append(v.getName())
                    .append("\n");
        });
        System.out.println(sb.toString().trim());
    }

    public CoffeeMaker chooseCoffee() {
        Scanner scanner = new Scanner(System.in);
        try {
            int coffeeNumber = scanner.nextInt();
            if (drinks.containsKey(coffeeNumber)) {
                return drinks.get(coffeeNumber);
            }
            System.out.println("Unknown coffee, please try again.");
        } catch (InputMismatchException e) {
            System.out.println("Unknown coffee, please try again.");
        }
        return chooseCoffee();
    }
}

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

    private final Map<Integer, String> drinks = new HashMap<>();

    public void addDrink(String name) {
        this.drinks.put(drinks.size() + 1, name);
    }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Choose a drink:\n");
        this.drinks.forEach((k, v) -> {
            sb.append(k)
                    .append(" - ")
                    .append(v)
                    .append("\n");
        });
        System.out.println(sb.toString().trim());
    }

    public CoffeeMaker chooseCoffee() {
        Scanner scanner = new Scanner(System.in);
        try {
            int coffeeNumber = scanner.nextInt();
            if (this.drinks.containsKey(coffeeNumber)) {
                switch (coffeeNumber) {
                    case 1: return new EspressoCoffeeMaker();
                    case 2: return new CappuccinoCoffeeMaker();
                    case 3: return new LatteCoffeeMaker();
                }
            }
            System.out.println("Unknown coffee, please try again.");
        } catch (InputMismatchException e) {
            System.out.println("Unknown coffee, please try again.");
        }
        return chooseCoffee();
    }
}

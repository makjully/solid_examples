package ru.levelup.solid_examples.liskov_substitution.right;

import java.util.Arrays;
import java.util.List;

public class CountAnimalsLegsApp {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Lion(), new Penguin(), new Snake(), new Penguin());
        animalsLegCount(animals);
    }

    public static void animalsLegCount(List<Animal> animals) {
        animals.forEach(Animal::legCount);
    }
}
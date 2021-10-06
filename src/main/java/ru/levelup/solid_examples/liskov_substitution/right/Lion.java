package ru.levelup.solid_examples.liskov_substitution.right;

public class Lion implements Animal {
    private final int legCount = 4;

    @Override
    public void legCount() {
        System.out.printf("Я лев и у меня %d лапы \n", legCount);
    }
}

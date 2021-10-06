package ru.levelup.solid_examples.liskov_substitution.right;

public class Penguin implements Animal {
    private final int legCount = 2;

    @Override
    public void legCount() {
        System.out.printf("Я пингвин и у меня %d ноги \n", legCount);
    }
}
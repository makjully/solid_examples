package ru.levelup.solid_examples.liskov_substitution.right;

public class Snake implements Animal {
    @Override
    public void legCount() {
        System.out.println("Я змея и что-то мне подсказывает, что у меня нет конечностей");
    }
}
package ru.levelup.solid_examples.liskov_substitution.wrong;

import lombok.Getter;

@Getter
public class Penguin implements Animal {
    private final int legCount = 2;
}
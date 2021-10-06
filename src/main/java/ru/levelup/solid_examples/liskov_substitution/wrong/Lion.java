package ru.levelup.solid_examples.liskov_substitution.wrong;

import lombok.Getter;

@Getter
public class Lion implements Animal {
    private final int legCount = 4;
}

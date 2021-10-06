package ru.levelup.solid_examples.interface_segregation.right;

import ru.levelup.solid_examples.interface_segregation.right.interfaces.Flying;
import ru.levelup.solid_examples.interface_segregation.right.interfaces.Runnable;
import ru.levelup.solid_examples.interface_segregation.right.interfaces.Speakable;

public class Parrot implements Flying, Runnable, Speakable {
    @Override
    public void fly() {
        System.out.println("Parrot can fly :)");
    }

    @Override
    public void run() {
        System.out.println("Parrot can run :)");
    }

    @Override
    public void speak() {
        System.out.println("Parrot can say 'hi' to you");
    }
}
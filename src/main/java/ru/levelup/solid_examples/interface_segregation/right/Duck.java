package ru.levelup.solid_examples.interface_segregation.right;

import ru.levelup.solid_examples.interface_segregation.right.interfaces.Flying;
import ru.levelup.solid_examples.interface_segregation.right.interfaces.Runnable;
import ru.levelup.solid_examples.interface_segregation.right.interfaces.Swimmable;

public class Duck implements Swimmable, Runnable, Flying {
    @Override
    public void fly() {
        System.out.println("Duck can fly :)");
    }

    @Override
    public void run() {
        System.out.println("Duck can run :)");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim :)");
    }
}
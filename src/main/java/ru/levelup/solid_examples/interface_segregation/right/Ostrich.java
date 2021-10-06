package ru.levelup.solid_examples.interface_segregation.right;

import ru.levelup.solid_examples.interface_segregation.right.interfaces.Runnable;

public class Ostrich implements Runnable {
    @Override
    public void run() {
        System.out.println("Ostrich can run :)");
    }
}

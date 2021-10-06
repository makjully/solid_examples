package ru.levelup.solid_examples.interface_segregation.wrong;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("Duck can fly :)");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim :)");
    }

    @Override
    public void run() {
        System.out.println("Duck can run :)");
    }
}
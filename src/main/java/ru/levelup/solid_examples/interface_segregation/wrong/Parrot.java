package ru.levelup.solid_examples.interface_segregation.wrong;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("Parrot can fly :)");
    }

    @Override
    public void swim() {
        System.out.println("Parrot can not swim :(");
    }

    @Override
    public void run() {
        System.out.println("Parrot can run :)");
    }

    public void speak() {
        System.out.println("Parrot can say 'hi' to you");
    }
}
package ru.levelup.solid_examples.interface_segregation.wrong;

public class Ostrich implements Bird{
    @Override
    public void fly() {
        System.out.println("Ostrich can not fly :(");
    }

    @Override
    public void swim() {
        System.out.println("Ostrich can not swim :(");
    }

    @Override
    public void run() {
        System.out.println("Ostrich can run :)");
    }
}
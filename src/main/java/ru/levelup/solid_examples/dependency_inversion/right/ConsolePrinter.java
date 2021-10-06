package ru.levelup.solid_examples.dependency_inversion.right;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println("Печать в консоли: " + text);
    }
}
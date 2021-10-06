package ru.levelup.solid_examples.dependency_inversion.wrong;

public class Message {
    private String text;
    private ConsolePrinter printer;

    public void print() {
        printer.print(text);
    }
}
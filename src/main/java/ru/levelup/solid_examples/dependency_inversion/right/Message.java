package ru.levelup.solid_examples.dependency_inversion.right;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String text;
    private Printer printer;

    public void print() {
        printer.print(text);
    }
}
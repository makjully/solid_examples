package ru.levelup.solid_examples.dependency_inversion.right;

public class MessagePrinterApp {
    public static void main(String[] args) {
        Message message = new Message("hello", new ConsolePrinter());
        message.print();
        message.setPrinter(new HtmlPrinter());
        message.print();
    }
}
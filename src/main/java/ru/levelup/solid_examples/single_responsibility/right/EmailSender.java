package ru.levelup.solid_examples.single_responsibility.right;

public interface EmailSender {
    void sendEmail(Employee employee, EmailContent content);
}

package ru.levelup.solid_examples.single_responsibility.right.impl;

import ru.levelup.solid_examples.single_responsibility.right.EmailSender;
import ru.levelup.solid_examples.single_responsibility.right.Employee;
import ru.levelup.solid_examples.single_responsibility.right.EmployeeStore;

public class EmployeeStoreImpl implements EmployeeStore {
    private EmailSender emailSender;

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
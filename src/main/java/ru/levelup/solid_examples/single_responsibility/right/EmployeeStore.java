package ru.levelup.solid_examples.single_responsibility.right;

public interface EmployeeStore {
    Employee getEmployeeById(Long id);

    void addEmployee(Employee employee);
}
package ru.levelup.solid_examples.single_responsibility.wrong;

public class EmployeeStore {

    public Employee getEmployeeById(Long id) {
        return null;
    }

    public void addEmployee(Employee employee) {
    }

    public void sendEmail(Employee employee, String content) {
    }
}
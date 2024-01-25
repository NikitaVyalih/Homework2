package org.nikita.manager;

import org.nikita.Employee;

public class Envelope_1 {
    public static void main(String[] args) {


        Employee employee1 = new Employee(100, "Petrov", 2);
        employee1.printSalary();
        employee1.printSurname();
        employee1.printId();


    }
}
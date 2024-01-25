package org.nikita;

public class Employee {

    private int salary;
    public String surname;
    int id;


    public void printSalary(){
        System.out.println(salary);
    }
    public void printSurname(){
        System.out.println(surname);
    }
    public void printId(){
        System.out.println(id);
    }

    public Employee(int salary,  String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
    Employee(int salary, int id, String surname){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
    private Employee(String surname, int salary, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] args) {


        Employee employee = new Employee("Perviy", 10000, 9);
        employee.printSalary();
        employee.printSurname();
        employee.printId();
        System.out.println();
    }



}

class Envelope{

    public static void main(String[] args) {

        Employee employee = new Employee(1000, "Ivanov", 1);
        employee.printSalary();
        employee.printId();
        employee.printSurname();
        System.out.println();

        Employee employee1 = new Employee(2000, 3, "Semenov");
        employee1.printSalary();
        employee1.printId();
        employee1.printSurname();
    }



}
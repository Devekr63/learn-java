package org.example;

import java.util.ArrayList;
import java.util.List;

public class Throws {
    static List<Employee> company = new ArrayList<>();
    public static void main(String[] args){
        try{
            addEmployee(new Employee("1001","Devendra", "Kumar", 1000000.0));
            addEmployee(new Employee("1000","Depak", "Kumar", 1200000.0));
            addEmployee(new Employee("1001","Shubham", "Kumar", 1000000.0));
        }catch(EmployeeExists e){
            System.out.println(e.getMessage());
        }

        for(Employee e: company){
            System.out.println(e);
        }

        try {
            deleteEmployee("1002");
        }catch(EmployeeDoesNotExists e){
            System.out.println(e.getMessage());
        }

        for(Employee e: company){
            System.out.println(e);
        }
    }

    private static void addEmployee(Employee employee) throws EmployeeExists{
        if(findEmployeeWithSameId(employee.getId())){
            throw new EmployeeExists("There exists an employee with similar id, please enter a different id.");
        }else {
            company.add(employee);
        }
    }

    private static void deleteEmployee(String employeeId) throws EmployeeDoesNotExists{
        if(!findEmployeeWithSameId(employeeId)){
            throw new EmployeeDoesNotExists("Employee does not exists having the id "+employeeId);
        }
        else {
            company.removeIf(e -> e.getId().equals(employeeId));
        }
    }

    private static boolean findEmployeeWithSameId(String employeeId){
        for(Employee e:company){
            if(e.getId().equals(employeeId)) return true;
        }
        return false;
    }
}

class Employee{
    private String id;
    private  String firstName;
    private String lastName;

    private double salary;

    public Employee(String id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDoesNotExists extends Exception{
    public EmployeeDoesNotExists(String message){
        super(message);
    }
}

class EmployeeExists extends Exception{
    public EmployeeExists(String message){
        super(message);
    }
}

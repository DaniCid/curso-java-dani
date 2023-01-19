package com.exercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarModel.BMW, CarColor.BLUE);
        Car car2 = new Car(CarModel.MERCEDES, CarColor.BLACK);
        Car car3 = new Car(CarModel.BMW, CarColor.RED);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Employee employee1 = new Employee("Emp1", cars, 1000.0d);
        Employee employee2 = new Employee("Emp2", cars, 900.0d);
        Employee employee3 = new Employee("Emp3", cars, 1200.0d);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Company company1 = new Company("Amazon", employees, 50);

        System.out.println("Company: " + company1.getName());
        System.out.println("Number of employees: " + employees.size());

        for (Employee employee : employees)
            System.out.println(employee.getName() + " can use " + employee.getCars().size() + " cars.");
    }
}

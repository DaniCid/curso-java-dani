package com.exercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarModel.BMW, CarColor.BLUE);
        Car car2 = new Car(CarModel.MERCEDES, CarColor.BLACK);
        Car car3 = new Car(CarModel.BMW, CarColor.RED);
        Car car4 = new Car(CarModel.VOLVO, CarColor.BLACK);
        Car car5 = new Car(CarModel.VOLVO, CarColor.BLACK);

        ArrayList<Car> cars1 = new ArrayList<>();
        cars1.add(car1);
        cars1.add(car2);
        cars1.add(car3);

        ArrayList<Car> cars2 = new ArrayList<>();
        cars2.add(car4);
        cars2.add(car5);

        Employee employee1 = new Employee("Emp1", cars1, 1000.0d);
        Employee employee2 = new Employee("Emp2", cars1, 900.0d);
        Employee employee3 = new Employee("Emp3", cars2, 1200.0d);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Company company1 = new Company("Amazon", employees, 50);

        System.out.println("Company: " + company1.getName());
        System.out.println("Number of employees: " + employees.size());
        System.out.println("The company has: " + company1.countCars() + " cars.");

        for (Employee employee : employees)
            System.out.println(employee.getName() + " can use " + employee.getCars().size() + " cars.");
    }
}

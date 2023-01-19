package com.exercises;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<Car> cars;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, ArrayList<Car> cars, Double salary) {
        this.name = name;
        this.cars = cars;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                ", salary=" + salary +
                '}';
    }
}

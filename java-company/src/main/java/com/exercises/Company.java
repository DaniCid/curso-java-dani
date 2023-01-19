package com.exercises;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;
    private Integer shares;

    public Company() {
    }

    public Company(String name, ArrayList<Employee> employees, Integer shares) {
        this.name = name;
        this.employees = employees;
        this.shares = shares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", shares=" + shares +
                '}';
    }
}

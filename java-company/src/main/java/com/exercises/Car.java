package com.exercises;

public class Car {
    private CarModel model;
    private CarColor color;

    public Car() {
    }

    public Car(CarModel model, CarColor color) {
        this.model = model;
        this.color = color;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

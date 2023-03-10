package com.exercises;

import java.util.Arrays;

public class Product {
    private String name;
    private Manufacturer manufacturer;
    private Integer barcode;
    private String[] specifications;
    private String color;
    private Double size;
    private String material;
    private Double price;
    private Integer amount;

    public Product(){}

    public Product(String name, Manufacturer manufacturer, Integer barcode, String[] specifications, String color, Double size, String material, Double price, Integer amount) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.barcode = barcode;
        this.specifications = specifications;
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public String[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String[] specifications) {
        this.specifications = specifications;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer=" + manufacturer +
                ", barcode=" + barcode +
                ", specifications=" + Arrays.toString(specifications) +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

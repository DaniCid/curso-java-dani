package com.exercises;

import java.util.Arrays;

public class Product {
    private String name;
    private Integer barcode;
    private String[] specifications;
    private String color;
    private Double size;
    private String material;
    private Double price;

    public Product(){}

    public Product(String name, Integer barcode, String[] specifications, String color, Double size, String material, Double price) {
        this.setName(name);
        this.setBarcode(barcode);
        this.setSpecifications(specifications);
        this.setColor(color);
        this.setSize(size);
        this.setMaterial(material);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barcode=" + barcode +
                ", specifications=" + Arrays.toString(specifications) +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}

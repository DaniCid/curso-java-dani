package com.exercises;

import static com.exercises.ProductStats.*;

public class Main {
    public static void main(String[] args) {

        Manufacturer asus = new Manufacturer("Asus");
        Manufacturer logitech = new Manufacturer("Logitech");
        Manufacturer apple = new Manufacturer("Apple");
        Manufacturer corsair = new Manufacturer("Corsair");

        Product product01 = new Product("mouse", logitech, 21004562, new String[]{"gaming", "60dpi"}, "black", 10.5d, "pvc", 68.90d, 20);
        Product product02 = new Product("keyboard", logitech, 38892710, new String[]{"gaming", "mechanical", "cherry red"}, "white", 23.5d, "aluminium", 89.90d, 18);
        Product product03 = new Product("screen", apple, 43812043, new String[]{"led", "140hz", "UHD"}, "black", 23.5d, "pvc", 399.0d, 4);
        Product product04 = new Product("RAM", corsair, 11100498, new String[]{"8GB", "ddr4"}, "black", 13.3d, "fibreglass", null, 4);
        Product product05 = new Product("motherboard", asus, 18911120, new String[]{"gaming", "intel"}, "black", 31.35d, "fibreglass", 188.90d, 1);

        Double totalPrice;
        Double average;
        Double maxPrice;
        Double minPrice;
        Double stockPrice;

        Product[] products = { product01, product02, product03, product04, product05 };

        totalPrice = calculateTotalPrice(products);
        System.out.println("Total Price: " + totalPrice);

        average = calculateAveragePrice(products);
        System.out.println("Average Price: " + average);

        maxPrice = getMaxPrice(products);
        System.out.println("Max Price: " + maxPrice);

        minPrice = getMinPrice(products);
        System.out.println("Min Price: " + minPrice);

        stockPrice = calculateStockPrice(products);
        System.out.println("Stock Price: " + stockPrice);
    }


}

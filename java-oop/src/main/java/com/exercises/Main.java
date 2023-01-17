package com.exercises;

public class Main {
    public static void main(String[] args) {

        Product product01 = new Product("mouse", 21004562, new String[]{"gaming", "60dpi"}, "black", 10.5d, "pvc", 68.90d);
        Product product02 = new Product("keyboard", 38892710, new String[]{"gaming", "mechanical", "cherry red"}, "white", 23.5d, "aluminium", 89.90d);
        Product product03 = new Product("screen", 43812043, new String[]{"led", "140hz", "UHD"}, "black", 23.5d, "pvc", 399.0d);
        Product product04 = new Product("RAM", 11100498, new String[]{"8GB", "ddr4"}, "black", 13.3d, "fibreglass", 39.40d);
        Product product05 = new Product("motherboard", 18911120, new String[]{"gaming", "intel"}, "black", 31.35d, "fibreglass", 188.90d);

        Double totalPrice;
        Double average;
        Double maxPrice;

        Product[] products = { product01, product02, product03, product04, product05 };

        totalPrice = calculateTotalPrice(products);
        System.out.println(totalPrice);

        average = calculateAveragePrice(products);
        System.out.println(average);

        maxPrice = getMaxPrice(products);
        System.out.println(maxPrice);

    }

    public static Double calculateTotalPrice(Product[] products) {
        Double total = 0.0d;

        for (Product i : products) {
            total += i.getPrice();
        }
        return total;
    }

    public static Double calculateAveragePrice(Product[] products) {
        Double sum;

        sum = calculateTotalPrice(products);
        return sum/products.length;
    }

    public static Double getMaxPrice(Product[] products) {
        Double max = 0.0d;

        for (Product i : products) {
            max = Math.max(max, i.getPrice());
        }
        return max;
    }
}

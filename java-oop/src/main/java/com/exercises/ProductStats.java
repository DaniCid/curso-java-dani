package com.exercises;

public class ProductStats {

    public static Double calculateTotalPrice(Product[] products) {
        Double total = 0.0d;

        for (Product product : products) {
            if(product.getPrice() != null)
                total += product.getPrice();
        }
        return total;
    }

    public static Double calculateAveragePrice(Product[] products) {
        Double sum;
        Integer amount = products.length;

        sum = calculateTotalPrice(products);
        for (Product product : products) {
            if(product.getPrice() == null){
                amount--;
            }
        }
        return sum/amount;
    }

    public static Double getMaxPrice(Product[] products) {
        Double max = 0.0d;

        for (Product product : products) {
            if(product.getPrice() != null)
                max = Math.max(max, product.getPrice());
        }
        return max;
    }

    public static Double getMinPrice(Product[] products) {
        Double min = 0.0d;

        for (Product product : products) {
            if(product.getPrice() != null)
                min = Math.min(min, product.getPrice());
        }
        return min;
    }

    public static Double calculateStockPrice(Product[] products) {
        Double stockPrice = 0.0d;

        for (Product product : products) {
            if(product.getPrice() != null)
                stockPrice += product.getPrice() * product.getAmount();
        }
        return stockPrice;
    }
}

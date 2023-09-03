package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
private List<Product> products;
    private List<Integer> quantities;
    private double totalPrice;

    public ShoppingCart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
        totalPrice = 0;
    }

    public void addProduct(Product product, int quantity) throws InsufficientQuantityException {
        if (product.getAvailableQuantity() < quantity) {
            throw new InsufficientQuantityException("Insufficient quantity for product: " + product.getName());
        }
        products.add(product);
        quantities.add(quantity);
        totalPrice += product.getPrice() * quantity;
    }

    public double checkout() throws InsufficientQuantityException {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities.get(i);
            product.setAvailableQuantity(product.getAvailableQuantity() - quantity);
        }
        return totalPrice;
    }
}
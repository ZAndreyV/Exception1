package org.example.lesson3;

public class ShopManager {
    public static double purchaseProduct(Product product, int quantity) throws  InsufficientQuantityException{

        if (product.getAvailableQuantity() < quantity) {
            throw new InsufficientQuantityException("Insufficient quantity for product: " + product.getName());
        }
        return product.getPrice() * quantity;
    }
}
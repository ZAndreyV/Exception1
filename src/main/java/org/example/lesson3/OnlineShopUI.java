package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;

public class OnlineShopUI {
    public static void main(String[] args) {
        try {
            ProductDatabase productDatabase = new ProductDatabase();

            List<Product> products = new ArrayList<>();
            products.add(productDatabase.getProduct(1));
            products.add(productDatabase.getProduct(2));

            ShoppingCart shoppingCart = new ShoppingCart();

            for (Product product : products) {
                shoppingCart.addProduct(product, 1);
            }

            double totalPrice = shoppingCart.checkout();

            System.out.println("Total price: $" + totalPrice);
        } catch (ProductNotFoundException | InsufficientQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred");
        }
    }
}

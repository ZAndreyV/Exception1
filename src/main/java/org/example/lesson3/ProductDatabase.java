package org.example.lesson3;

public class ProductDatabase {
    public static Product getProduct(int productId) throws ProductNotFoundException{
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
                if (productId == 1) {
                    return new Product("Product 1", 10, 5.99);
                } else if (productId == 2) {
                    return new Product("Product 2", 5, 9.99);
                }
        throw new ProductNotFoundException("Product not found for ID: " + productId);
            }
        }
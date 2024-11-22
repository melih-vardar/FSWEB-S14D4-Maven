package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Milk Chocolate", 5.0, "Includes milk", false );
        ProductForSale coke = new Coke("Coca Cola", 3.0, "Drink cold", false);
        ProductForSale bread = new Bread("Whole Wheat Bread", 2.5, "Fresh", false);

        ProductForSale[] products = { chocolate, coke, bread };


        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            System.out.println(product);
            product.showDetails();

        }
    }
}
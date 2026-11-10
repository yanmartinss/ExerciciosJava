package oo.mercado.application;

import oo.mercado.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter the product data:");
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Price: ");
        double price = sc.nextDouble();
        IO.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);
        IO.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("Updated data: " + product);
        IO.print("Enter the number of products to be added in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        sc.close();
    }
}

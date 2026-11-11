package oo.heranca.product.application;

import oo.heranca.product.entities.ImportedProduct;
import oo.heranca.product.entities.Product;
import oo.heranca.product.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        IO.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:%n", i);
            IO.print("Common, used or imported (c/u/i)? ");
            String choice = sc.next();
            IO.print("Name: ");
            String name = sc.next();
            IO.print("Price: ");
            double price = sc.nextDouble();
            if (choice.equalsIgnoreCase("i")) {
                IO.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if  (choice.equalsIgnoreCase("c")) {
                list.add(new Product(name, price));
            } else if (choice.equalsIgnoreCase("u")) {
                IO.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                list.add(new UsedProduct(name, price, sdf.parse(date)));
            }
        }

        IO.println("PRICE TAGS:");
        for (Product p : list) {
            IO.print(p.priceTag());
        }

        sc.close();

    }
}

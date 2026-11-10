package exfix2.application;

import exfix2.entities.Client;
import exfix2.entities.Order;
import exfix2.entities.OrderItem;
import exfix2.entities.Product;
import exfix2.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IO.println("Enter the client data:");
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Email: ");
        String email = sc.nextLine();
        IO.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, birthDate, email);

        IO.println("Enter order data:");
        IO.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        IO.print("How many items to this order?: ");
        int items = sc.nextInt();
        sc.nextLine();

        Order order = new Order(client, status, new Date());

        for (int i = 0; i < items; i++) {
            System.out.printf("Enter #%d item data:%n", i + 1);
            IO.print("Product name: ");
            String productName = sc.nextLine();
            IO.print("Product price: ");
            Double productPrice = sc.nextDouble();
            IO.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, product, productPrice);

            order.addItem(it);
        }

        IO.println();
        IO.println("ORDER SUMMARY:");
        IO.println(order);

        sc.close();
    }

}

package interfaces.aula.application;

import interfaces.aula.model.entities.CarRental;
import interfaces.aula.model.entities.Vehicle;
import interfaces.aula.model.services.BrazilTaxService;
import interfaces.aula.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        IO.println("Entre com os dados do aluguel");
        IO.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        IO.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dtf);
        IO.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(retirada, new Vehicle(modelo), retorno);

        IO.print("Entre com o preço por hora: ");
        double precoPerHour = sc.nextDouble();
        IO.print("Entre com o preço por dia: ");
        double precoPerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(precoPerDay, new BrazilTaxService(),precoPerHour);

        rentalService.processInvoice(cr);

        IO.println("FATURA:");
        System.out.printf("Pagamento básico: %.2f%n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());

        sc.close();
    }

}

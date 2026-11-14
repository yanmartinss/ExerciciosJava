package interfaces.exercicio.application;

import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installment;
import interfaces.exercicio.model.services.ContractService;
import interfaces.exercicio.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        IO.println("Entre os dados do contrato:");
        IO.print("Número: ");
        int n = sc.nextInt();
        IO.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        IO.print("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contract obj = new Contract(n, valor, data);

        IO.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, parcelas);

        IO.println("Parcelas:");
        for (Installment installment : obj.getInstallments()) {
            IO.println(installment);
        }

        sc.close();
    }

}

package alura.ex001.application;

import alura.ex001.entities.ContaBanco;

import java.util.Scanner;

public class Program {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IO.println("Nome do cliente: ");
        String nome = sc.nextLine();
        IO.println("Tipo de Conta: ");
        String tipoConta = sc.nextLine();
        IO.println("Saldo Inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBanco cb = new ContaBanco(nome, tipoConta, saldoInicial);

        IO.println("1 - Consultar saldos");
        IO.println("2 - Receber valor");
        IO.println("3 - Transferir valor");
        IO.println("4 - Sair");

        int resp = sc.nextInt();

        if (resp == 1) {
            System.out.printf("%.2f%n", cb.consultarSaldo());
        } else if (resp == 2) {
            IO.print("Qual valor deseja receber? ");
            double valorReceber = sc.nextDouble();
            double valorReceberFinal = cb.receberValor(valorReceber);
            System.out.printf("%.2f%n", valorReceberFinal);
        } else if (resp == 3) {
            IO.print("Qual valor deseja transferir? ");
            double valorTransferir = sc.nextDouble();
            double valorTransferirFinal = cb.transferirValor(valorTransferir);
            System.out.printf("%.2f%n", valorTransferirFinal);
        } else if (resp == 4) {
            IO.print("Saiu");
        }

        sc.close();
    }

}

package alura.desafio02.application;

import alura.desafio02.model.entities.Cartao;
import alura.desafio02.model.entities.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite o limite do cartao:");
        double limiteCartao = sc.nextDouble();
        Cartao cartao = new Cartao(limiteCartao);

        while (true) {
            IO.println("Digite a descriçao da compra:");
            String descricaoCompra = sc.next();

            IO.println("Digite o valor da compra:");
            double valorCompra = sc.nextDouble();

            Compra compra = new Compra(descricaoCompra, valorCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                IO.println("Compra realizada com sucesso!");
                IO.println("Digite 0 para sair ou 1 para continuar");
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
            } else {
                IO.println("Saldo insuficiente!");
                break;
            }
        }

        IO.println("****************");
        IO.println("COMPRAS REALIZADAS:");
        IO.println("");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            IO.println(c.getDescricaoCompra() + " - " + c.getValorCompra());
        }
        IO.println("");
        IO.println("****************");

        IO.println("Saldo do cartao: " + cartao.getSaldo());

        sc.close();
    }

}

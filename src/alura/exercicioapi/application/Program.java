package alura.exercicioapi.application;

import alura.exercicioapi.model.ConsultaCep;
import alura.exercicioapi.model.Endereco;
import alura.exercicioapi.model.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        IO.println("Write a zipcode for consult:");
        String cep = sc.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            IO.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            IO.println(e.getMessage());
        }

        sc.close();
    }
}

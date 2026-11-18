package alura.ex002.application;

import alura.ex002.model.entities.Pessoa;

import java.util.ArrayList;

public class Program {

    static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Fulano", 22));
        listaDePessoas.add(new Pessoa("Maria", 23));
        listaDePessoas.add(new Pessoa("Juan", 24));

        IO.println(listaDePessoas.size());
        IO.println(listaDePessoas.getFirst().getNome());
        IO.println(listaDePessoas);
    }

}

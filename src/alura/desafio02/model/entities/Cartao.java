package alura.desafio02.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

    private double limiteCartao;
    private double saldo;

    private List<Compra> compras;

    public Cartao() {}

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compras = new ArrayList<>();
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValorCompra()) {
            this.saldo -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}

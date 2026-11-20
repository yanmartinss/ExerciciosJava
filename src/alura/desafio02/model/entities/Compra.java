package alura.desafio02.model.entities;

public class Compra implements Comparable<Compra>{

    private String descricaoCompra;
    private double valorCompra;

    public Compra() {}

    public Compra(String descricaoCompra, double valorCompra) {
        this.descricaoCompra = descricaoCompra;
        this.valorCompra = valorCompra;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "Produto: " + descricaoCompra + " $ " + valorCompra;
    }

    @Override
    public int compareTo(Compra outroCompra) {
        return Double.compare(this.valorCompra, outroCompra.valorCompra);
    }
}

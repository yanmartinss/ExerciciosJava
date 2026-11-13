package alura.ex001.entities;

public class ContaBanco {

    private String nome;
    private String tipoConta;
    private Double saldo;

    public ContaBanco() {}

    public ContaBanco(String nome, String tipoConta, Double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double receberValor(double valor) {
        return this.saldo += valor;
    }

    public double transferirValor(double valor) {
        return this.saldo -= valor;
    }
}

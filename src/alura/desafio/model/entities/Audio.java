package alura.desafio.model.entities;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio() {}

    public Audio(String titulo, int totalReproducoes, int totalCurtidas, int classificacao) {
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public Integer getTotalCurtidas() {
        return totalCurtidas;
    }

    public Integer getTotalReproducoes() {
        return totalReproducoes;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }
}

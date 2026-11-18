package alura.desafio.model.entities;

public class Podcast extends Audio{

    private String host;
    private String descricao;

    public Podcast() {
        super();
    }

    public Podcast(String titulo, Integer classificacao, Integer totalCurtidas, Integer totalReproducoes, String host, String descricao) {
        super(titulo, classificacao, totalCurtidas, totalReproducoes);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Integer getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}

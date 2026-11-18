package alura.desafio.model.entities;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    public Musica() {
        super();
    }

    public Musica(String titulo, Integer classificacao, Integer totalCurtidas, Integer totalReproducoes, String album, String genero, String artista) {
        super(titulo, classificacao, totalCurtidas, totalReproducoes);
        this.album = album;
        this.genero = genero;
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public Integer getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}

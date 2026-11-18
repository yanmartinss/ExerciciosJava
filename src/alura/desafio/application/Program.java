package alura.desafio.application;

import alura.desafio.model.entities.MinhasPreferidas;
import alura.desafio.model.entities.Musica;
import alura.desafio.model.entities.Podcast;

public class Program {

    static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Alan Walker");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolha dev");
        meuPodcast.setHost("Yan Doido");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas mp = new MinhasPreferidas();
        mp.inclui(meuPodcast);
        mp.inclui(minhaMusica);
    }

}

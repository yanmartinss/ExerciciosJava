package alura.screenmatch.principal;

import alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import alura.screenmatch.modelos.Titulo;
import alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String filme = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!filme.equalsIgnoreCase("sair")) {

            IO.print("Qual filme você quer pesquisar? ");
            filme = sc.nextLine();
            if (filme.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?apikey=85f39112&t=" + filme.replace(" ", "+")))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                IO.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                IO.println(meuTituloOmdb);
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                IO.println("Titulo ja convertido");
                IO.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (IllegalArgumentException e) {
                IO.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                IO.println(e.getMessage());
            }
        }

        IO.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        sc.close();
    }
}
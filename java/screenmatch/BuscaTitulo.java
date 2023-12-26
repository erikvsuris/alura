package screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscaTitulo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(buscarTitulo(scanner.nextLine()));
        scanner.close();
    }

    public static Titulo buscarTitulo(String titulo) throws IOException, InterruptedException {
        String apikey = "77d7785f";
    
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.omdbapi.com/?t=" + titulo + "&apikey=" + apikey))
            .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
        TituloOMDB novoTituloOMDB = gson.fromJson(json, TituloOMDB.class);
        Titulo novoTitulo = new Titulo(novoTituloOMDB);

        return novoTitulo;
    }
}   

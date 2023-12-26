package screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme que deseja buscar: ");
        String titulo = scanner.nextLine();
        String tituloJSON = buscaTitulo(titulo);
        System.out.println(tituloJSON);

        scanner.close();
    }

    public static String buscaTitulo(String titulo) throws IOException, InterruptedException {
        String apikey = "77d7785f";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.omdbapi.com/?t=" + titulo + "&apikey=" + apikey))
            .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());
        System.out.println(response.body());

        return response.body();
    }
}   

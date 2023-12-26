package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do livro que deseja buscar: ");
        String livro = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + livro))
            .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();
    }
}

package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do livro que deseja buscar: ");
        String criptomoeda = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=usd"))
            .build();
        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();
    }
}

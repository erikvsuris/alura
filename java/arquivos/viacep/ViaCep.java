package arquivos.viacep;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o CEP:");
        String cep = scanner.next();
        scanner.close();

        handleException(cep);

        String responseBody = getHttpResponseBody(cep);

        FileWriter writer = new FileWriter("./java/arquivos/viacep/endereco.json");
        writer.write(responseBody);
        writer.close();
    }

    private static void handleException(String cep) {
        if (cep.length() != 8)
            throw new IllegalArgumentException();
    }

    public static String getHttpResponseBody(String cep) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = getHttpRequest("https://viacep.com.br/ws/" + cep + "/json/");
        HttpResponse<String> response = client
         .send(request, BodyHandlers.ofString());
        return response.body();
    }

    private static HttpRequest getHttpRequest(String url) {
        return HttpRequest
            .newBuilder()
            .uri(URI.create(url))
            .build();
    }
}

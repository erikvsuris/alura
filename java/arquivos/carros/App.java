package arquivos.carros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) throws IOException { 
        File registro = new File("./java/arquivos/carros/registro.json");
        FileWriter writer = new FileWriter(registro);

        List<Carro> registroCarros = new ArrayList<>();
        registroCarros.add(new Carro("Mobi", "Fiat", 2023));
        registroCarros.add(new Carro("C3", "Citroën", 2023));
        registroCarros.add(new Carro("Kwid", "Renault", 2023));

        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
        String registroCarrosJSON = gson.toJson(registroCarros);

        writer.write(registroCarrosJSON);
        writer.close();
    }
}

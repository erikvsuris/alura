package api.LivroRecord;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversorJSON {
    public static void main(String[] args) {
        String json = """
                {
                    "Titulo": "Accelerate: The Science of Lean Software and DevOps",
                    "Autores": [
                        "Nicole Forsgren",
                        "Jez Humble",
                        "Gene Kim"
                    ],
                    "Editora": "IT Revolution Press"
                }
                """;

        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
        Livro livro = gson.fromJson(json, Livro.class);
        
        System.out.println("\n" + livro);
    }
}

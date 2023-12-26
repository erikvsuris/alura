package api.LivroRecord;

import java.util.Arrays;

public record Livro(String titulo, String[] autores, String editora) {
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo +
        ", autores=" + Arrays.toString(autores) +
        ", editora=" + editora + "]";
    }    
}

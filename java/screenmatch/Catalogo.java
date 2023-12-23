package screenmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Catalogo {
    private List<Titulo> titulos;

    public Catalogo() {
        titulos = new ArrayList<>();
    }

    public void adicionarTitulo(Titulo titulo) {
        titulos.add(titulo);
    }

    public void ordenarPorNome() {
        Collections.sort(titulos);
    }

    public void ordenarPorAnoDeLancamento() {
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    }

    @Override
    public String toString() {
        return titulos.toString();
    }
}

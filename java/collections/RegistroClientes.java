package collections;

import java.util.Map;
import java.util.HashMap;

public class RegistroClientes {
    private Map<String, Cliente> registro;

    public RegistroClientes() {
        registro = new HashMap<>();
    }

    public void adicionarCliente(String nome, int idade, String cpf) {
        if (nome == null || nome.length() <= 0) return;
        if (idade < 18) return;
        if (cpf == null || cpf.length() != 14) return;

        registro.put(cpf, new Cliente(nome, idade));
    }

    public Cliente buscarCliente(String cpf) {
        if (cpf == null) return null;
        
        return registro.get(cpf);
    }
}

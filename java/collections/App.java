package collections;

public class App {
    public static void main(String[] args) {
        RegistroClientes registro = new RegistroClientes();

        registro.adicionarCliente("Renato", 47, "123.456.789-01");
        registro.adicionarCliente("Júlio", 43, "789.123.456-02");
        registro.adicionarCliente("Paulo", 43, "456.789.123-03");

        System.out.println(registro.buscarCliente("123.456.789-01"));
    }
}

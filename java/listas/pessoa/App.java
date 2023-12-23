package listas.pessoa;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 31));
        pessoas.add(new Pessoa("Pedro", 23));

        System.out.println("Tamanho da Lista: " + pessoas.size());
        System.out.println("Primeira Pessoa: " + pessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}

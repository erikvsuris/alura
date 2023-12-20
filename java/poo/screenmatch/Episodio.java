package poo.screenmatch;

public class Episodio {
    private int numero;
    private String nome;
    private Serie serie;
    
    public Episodio(int numero, String nome, Serie serie) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Serie getSerie() {
        return serie;
    }
}

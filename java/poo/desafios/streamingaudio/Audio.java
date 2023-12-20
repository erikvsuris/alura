package poo.desafios.streamingaudio;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int reproducoes;
    private int curtidas;
    private double avaliacao;

    public Audio(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return avaliacao;
    }

    public void reproduzir() {
        reproducoes++;
    }

    public void curtir() {
        curtidas++;
    }

    public void avaliar(double notaDeAvaliacao) {
        avaliacao = (avaliacao + notaDeAvaliacao) / 2;
    }
}

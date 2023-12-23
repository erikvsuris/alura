package screenmatch;

public class Titulo implements Comparable<Titulo> {
    protected String nome;
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    protected double somaDasAvaliacoes;
    protected int numeroDeAvaliacoes;
    protected int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void adicionarAvaliacao(double novaAvaliacao) {
        somaDasAvaliacoes += novaAvaliacao;
        numeroDeAvaliacoes++;
    }

    public double obterMediaDasAvaliacoes() {
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo other) {
        return this.nome.compareTo(other.nome);
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
                + ", somaDasAvaliacoes=" + somaDasAvaliacoes + ", numeroDeAvaliacoes=" + numeroDeAvaliacoes
                + ", duracaoEmMinutos=" + duracaoEmMinutos;
    }
}

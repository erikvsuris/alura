package screenmatch;

public class Titulo implements Comparable<Titulo> {
    protected String nome;
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    protected double somaDasAvaliacoes;
    protected int numeroDeAvaliacoes;
    protected int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB novoTituloOMDB) {
        this.nome = novoTituloOMDB.title();

        if (novoTituloOMDB.year().length() > 4)
            throw new ErroDeConversaoException("Não foi possível converter o ano, String possui mais de 4 caracteres");

        this.anoDeLancamento = Integer.valueOf(novoTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(novoTituloOMDB.runtime().substring(0,3).trim());
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
        return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
                + ", somaDasAvaliacoes=" + somaDasAvaliacoes + ", numeroDeAvaliacoes=" + numeroDeAvaliacoes
                + ", duracaoEmMinutos=" + duracaoEmMinutos + "]";
    }
}

package poo.screenmatch;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;
    
    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio, boolean ativa) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    
    public int getTemporadas() {
        return temporadas;
    }
    
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Serie " + super.toString() + ", temporadas=" + temporadas + ", episodiosPorTemporada=" + episodiosPorTemporada
                + ", minutosPorEpisodio=" + minutosPorEpisodio + ", ativa=" + ativa + "]";
    }
}

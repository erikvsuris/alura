package poo.desafios.streamingaudio;

public class Podcast extends Audio {
    private String host;
    private String guest;
    private String descricao;

    public Podcast(String titulo, int duracaoEmMinutos, String host, String guest, String descricao) {
        super(titulo, duracaoEmMinutos);
        this.host = host;
        this.guest = guest;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public String getGuest() {
        return guest;
    }
    
    public String getDescricao() {
        return descricao;
    }
}

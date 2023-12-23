package poo.streamingaudio;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;
    
    public Musica(String titulo, int duracaoEmMinutos, String album, String cantor, String genero) {
        super(titulo, duracaoEmMinutos);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }
}

package screenmatch;

public class Filme extends Titulo {
    private String diretor;
    
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento);
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.diretor = diretor;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

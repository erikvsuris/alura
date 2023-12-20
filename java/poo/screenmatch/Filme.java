package poo.screenmatch;

public class Filme extends Titulo {
    private String diretor;
    
    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.diretor = diretor;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme " + super.toString() + ", diretor=" + diretor + "]";
    }
}

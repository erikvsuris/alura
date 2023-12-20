package poo.screenmatch;

public class App {
    public static void main(String[] args) {
        System.out.println("\n --- SCREEN MATCH ---\n");

        Filme oPoderosoChefao = new Filme("O Poderoso Chefão", 1972, true, 175, "Francis Ford Coppola");
        Serie suits = new Serie("Suits", 2011, true, 9, 16, 40, true); 

        oPoderosoChefao.adicionarAvaliacao(5);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.8);

        suits.adicionarAvaliacao(5);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.8);

        System.out.println("Média das Avaliações de \"" + oPoderosoChefao.getNome() + "\": " + oPoderosoChefao.obterMediaDasAvaliacoes());
        System.out.println("Média das Avaliações de \"" + suits.getNome() + "\": " + suits.obterMediaDasAvaliacoes());

        System.out.println(oPoderosoChefao);
        System.out.println(suits);
    }
}

package screenmatch;

public class App {
    public static void main(String[] args) {
        var catalogo = new Catalogo();

        Filme oPoderosoChefao = new Filme("O Poderoso Chefão", 1972, 175, "Francis Ford Coppola");

        oPoderosoChefao.adicionarAvaliacao(5);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.9);
        oPoderosoChefao.adicionarAvaliacao(4.8);

        Serie suits = new Serie("Suits", 2011, 9, 16, 40, true);

        suits.adicionarAvaliacao(5);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.9);
        suits.adicionarAvaliacao(4.8);
        
        Filme fnaf = new Filme("Five Nights at Freddy's - O Pesadelo Sem Fim", 2023, 109, "Emma Tammi");
        
        fnaf.adicionarAvaliacao(4.9);
        fnaf.adicionarAvaliacao(4.7);
        fnaf.adicionarAvaliacao(4.6);
        fnaf.adicionarAvaliacao(4.2);
        fnaf.adicionarAvaliacao(4.1);
        
        catalogo.adicionarTitulo(suits);
        catalogo.adicionarTitulo(oPoderosoChefao);
        catalogo.adicionarTitulo(fnaf);

        // catalogo.ordenarPorNome();
        catalogo.ordenarPorAnoDeLancamento();

        System.out.println("\n --- SCREEN MATCH ---\n");
        System.out.println(catalogo);

        System.out.println();
        System.out.println();
        System.out.println();

    }
}

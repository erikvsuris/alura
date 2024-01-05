class Livro {
    #nome;
    #editora;
    #paginas;

    constructor(nome, editora, paginas) {
        this.#nome = nome,
        this.#editora = editora,
        this.#paginas = paginas;
    }

    get nome() {
        return this.#nome;
    }

    get editora() {
        return this.#editora;
    }

    get paginas() {
        return this.#paginas;
    }

    toString() {
        return `${this.#nome} ${this.#editora} ${this.#paginas}`;
    }
}

class LivroColecao extends Livro {
    #nomeColecao;
    constructor(nome, editora, paginas, nomeColecao) {
        super(nome, editora, paginas);
        this.#nomeColecao = nomeColecao;
    }

    toString() {
        return `${super.toString()} ${this.#nomeColecao}`;
    }
}

const codigoLimpo = new LivroColecao('Código Limpo', 'Alta Books', 425, 'Programação');
console.log(codigoLimpo.toString());
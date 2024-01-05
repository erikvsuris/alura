function Livro(nome, editora, paginas) {
	this.nome = nome,
	this.editora = editora,
	this.paginas = paginas;

	this.getNome = function() {
		return this.nome;
	}

	this.getEditora = function() {
		return this.editora;
	}

	this.getPaginas = function() {
		return this.paginas;
	}

	this.exibirInfo = function() {
	  console.log(this.nome, this.editora, this.paginas);
  }
}

const codigoLimpo = new Livro('Código Limpo', 'Alta Books', 425);
codigoLimpo.exibirInfo();
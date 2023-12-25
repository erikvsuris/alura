const clientes = require('./clientes.json');

function pesquisarCliente(chave, valor) {
    return clientes.find(cliente => cliente[chave] === valor);
}

function filtrarAptoSemComplemento() {
    return clientes.filter(cliente => cliente.endereco.apartamento && !cliente.endereco.hasOwnProperty('complemento'));
}

function ordenarClientes(chave) {
    return clientes.sort((c1,c2) => {
        if (c1[chave] > c2[chave]) return 1;
        else if (c1[chave] < c2[chave]) return -1;
        else return 0;
    });
}

// console.log(pesquisarCliente('nome', 'Kirby'));
// console.log(filtrarAptoSemComplemento());
console.log(ordenarClientes('nome'));
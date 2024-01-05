const admin = {
    nome: 'Deus',
    email: 'senhor@deus.com',
    role: 'admin',
    criarLuz: function() {
        console.log("Haja luz");
    }
}

const pastor = {
    nome: 'Jesus',
    nascimento: '00/00/0000',
    role: 'pastor',
    ativo: true,
    orar: function() {
        console.log(`Em nome de ${this.nome}, amém`);
    }
}

Object.setPrototypeOf(pastor, admin);
pastor.criarLuz();
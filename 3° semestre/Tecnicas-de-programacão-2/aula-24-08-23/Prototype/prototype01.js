// classe pessoa - usada como referencia para ser clonada
class Pessoa {
    constructor(id, nome, idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // metodo clone para realizar a copia do objeto
    clone() {
        return new Pessoa(this.id, this.nome, this.idade);
    }
}

// Classe GerenciamentoPessoa para gerenciar instancias de pessoas:
class GerenciamentoPessoa {
    constructor() {
        this.pessoas = {};
    }

    // adiciona uma nova pessoa ao dicionario de pessoas
    adicionarPessoa(id, nome, idade) {
        const pessoa = new Pessoa(id, nome, idade);
        this.pessoas[id] = pessoa;
    }

    // solicita uma pessoa pelo id e retorna uma copia dela:
    getPessoaById(id) {
        const pessoaOriginal = this.pessoas[id];
        if (pessoaOriginal) {
            return pessoaOriginal.clone();
        } else {
            return null;
        }
    }
}

// Criando uma instancia de gerenciamentoPessoa:
const gerencia = new GerenciamentoPessoa();

// Adicionando pessoas:
gerencia.adicionarPessoa(1, "junin", 21);
gerencia.adicionarPessoa(2, "jobson", 40);
gerencia.adicionarPessoa(3, "Edson", 30);

// Clonando pessoas e modificando informações:
const pessoaClone1 = gerencia.getPessoaById(1);
if (pessoaClone1) {
    pessoaClone1.nome = "Junin Gameplays";
}

// exibindo pessoas:
console.log("----------- Pesssoa original -----------");
console.log(gerencia.getPessoaById(1));
console.log(gerencia.getPessoaById(2));
console.log(gerencia.getPessoaById(3));

console.log("----------- Pesssoa clonada -----------");
console.log(pessoaClone1);
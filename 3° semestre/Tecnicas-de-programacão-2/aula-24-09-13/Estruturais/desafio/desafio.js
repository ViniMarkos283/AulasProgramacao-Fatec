// juntar a ideia do composite e do decorator no script da pizzaria

class Pizza {
    constructor(nome) {
        this.nome = nome;
    }

    adicionar() { };

    remover() { };

    obterNome() { };
}

class Sabor extends Pizza {
    constructor(nome, preco) {
        super(nome);
        this.preco = preco;
    }

    obterNome() {
        return this.nome;
    }

    obterPreco() {
        return this.preco;
    }
}

class Adicionais extends Pizza {
    constructor(nome, preco) {
        super(nome);
        this.preco = preco;
    }

    obterNome() {
        return this.nome;
    }

    obterPreco() {
        return this.preco;
    }
}

class Pedido extends Pizza {
    constructor(nome) {
        super(nome);
        this.componentes = [];
    }

    adicionar(componente) {
        this.componentes.push(componente);
    }

    remover(componente) {
        const index = this.componentes.indexOf(componente);
        this.componentes.splice(index, 1);
    }

    obterNome() {
        return this.nome;
    }

    obterPreco() {
        let preco = 0;
        this.componentes.forEach(componente => {
            preco += componente.obterPreco();
        });
        return preco;
    }

}

// Interface do Usuario - sabores
const mussarela = new Sabor('Mussarela', 30.00);
const calabresa = new Sabor('Calabresa', 30.00);
const frangoCatupiry = new Sabor('Frango c/ Catupiry', 30.00);
const carneSeca = new Sabor('Carne Seca', 30.00);
const quatroQueijos = new Sabor('Quatro Queijos', 30.00);

// Tabela de Frete:
const freteSP = new Adicionais('SP', 10.00);
const freteRJ = new Adicionais('RJ', 20.00);
const freteMG = new Adicionais('MG', 30.00);

// adição da embalagem
const embalagem = new Adicionais('Embalagem', 2.50)

const pizzas = new Pedido('pizzas');
pizzas.adicionar(mussarela);
pizzas.adicionar(calabresa);
pizzas.adicionar(frangoCatupiry);

const pedido = new Pedido('pedido de pizzas');
pedido.adicionar(pizzas);
pedido.adicionar(embalagem);
//pedido.adicionar(new Sabor('Embalagem', 4.00));

const frete = new Pedido('Frete');
frete.adicionar(freteSP);
frete.adicionar(pedido);

console.log("Seu pedido:")
pizzas.componentes.forEach(componente => {
    console.log(`${componente.obterNome()} - R$ ${componente.obterPreco().toFixed(2)}`);
});

console.log(`Preço total das pizzas: R$ ${pizzas.obterPreco().toFixed(2)}\n`);
console.log(`Preço pedido das pizzas (pizzas + Embalagem R$ ${embalagem.preco.toFixed(2)}): R$ ${pedido.obterPreco().toFixed(2)}\n`);
console.log(`Preço Total + frete: (${precoFrete}) R$ ${frete.obterPreco().toFixed(2)}`);

// incomplete, finish later
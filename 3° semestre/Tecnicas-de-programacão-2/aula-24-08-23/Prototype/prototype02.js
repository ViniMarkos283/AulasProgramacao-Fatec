// pizzaria com padrao de projeto - prototype:

// classe pizza que representa um tipo de pizza:
class Pizza {
    constructor(sabor, preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    clone() {
        return new Pizza(this.sabor, this.preco);
    }
}

// classe pedidoPizza representa um pedido de pizza:
class pedidoPizza {
    constructor(cliente, pizzas) {
        this.cliente = cliente;
        this.pizzas = pizzas;
    }

    calculaTotal() {
        let total = 0;
        this.pizzas.forEach(pizza => {
            total += pizza.preco;

        }); return total;
    }
}

class Pizzaria {
    constructor(nome) {
        this.nome = nome;
        this.cardapio = {};
    }

    adicionaPizza(sabor, preco) {
        this.cardapio[sabor] = new Pizza(sabor, preco);
    }

    fazerpedido(cliente, sabores) {
        const pizzas = [];
        sabores.forEach(sabor => {
            if (this.cardapio.hasOwnProperty(sabor)) {
                pizzas.push(this.cardapio[sabor].clone());
            } else {
                console.log(`Desculpe, ${this.nome} não oferece a pizza de ${sabor}`);
            }
        }
        )

if (pizzas.length > 0) {
    const pedido = new pedidoPizza(cliente, pizzas);
    console.log(`pedido recebido de ${cliente}: `)
    pedido.pizzas.forEach(pizza => {
        console.log(`${pizza.sabor} - R$ ${pedido.calculaTotal().toFixed(2)}`)
    });
}}};



// exemplo de uso
const minhaPizzaria = new Pizzaria(`Pizzaria do Mario`);

minhaPizzaria.adicionaPizza(`Mussarela`, 30);
minhaPizzaria.adicionaPizza(`Calabresa`, 35);
minhaPizzaria.adicionaPizza(`Portugues`, 40);

minhaPizzaria.fazerpedido("joao", ["Mussarela", "Calabresa"])
minhaPizzaria.fazerpedido("maria", ["Mussarela"])
// PROJETO DESAFIO:
// - Desenvolver em grupo de no max 3 alunos;
// - Utilizar o Padrão de Projeto Builder, Factory Method e Prototype
// - Utilizar a linguagem JavaScript (POO)

// ESCOPO:
// - Um sistema de pizzaria por pizza personalizada:

//   a) Tamanho:
//     Padrão - 30cm
//     Brotinho - 20cm
//     Grande - 35cm
//     Família - 40cm

//   b) Borda:
//     Tradicional
//     Sem Borda
//     Recheada Catupiry
//     Recheada Cheddar

//   c) Sabores:
//     (criar 5 sabores)

//   d) Ingredientes Extra:
//     (criar 5 opções de ingredientes extra)

//   f) Ingredientes Opcionais de Finalização:
//     Orégano
//     Pimenta Calabresa
//     Pimenta do Reino
//     Azeitona Verde
//     Azeitona Preta    

// Entregue os arquivos JS, caso seja necessário entregar algum comentário ou instrução adicionar, adicione um arquivo README explicando. 

class Pizza {
	constructor() {
	}
	tamanho;
	borda;
	sabor;
	extra;
	final;
}

class Builder {
	constructor() {
		this.reset();
	}

	#pizza = new Pizza();

	reset() {
		this.#pizza = new Pizza();
	}

	setTamanho(tamanho) {
		switch (tamanho) {
			case 'padrao':
				tamanho = 30;
				break;
			case 'brotinho':
				tamanho = 20;
				break;
			case 'grande':
				tamanho = 35;
				break;
			case 'familia':
				tamanho = 40;
				break;
		}

		this.#pizza.tamanho = tamanho;
	}

	setBorda(borda) {
		this.#pizza.borda = borda;
	}

	setSabor(sabor) {
		this.#pizza.sabor = sabor;
	}

	setExtra(extra) {
		this.#pizza.extra = extra;
	}

	setFinal(final) {
		this.#pizza.final = final;
	}

	getDetalhes() {
		console.log(`Tamanho: ${this.#pizza.tamanho}\nBorda: ${this.#pizza.borda}\nSabor: ${this.#pizza.sabor}\nIngrediente Extra: ${this.#pizza.extra}\nIngrediente Opcional: ${this.#pizza.final}\n`);
	}

	getPizza() {
		const newPizza = this.#pizza;
		this.reset();
		return newPizza;
	}
}

function checkInput(input, option) {
	const found = option.find((element) => input == element);

	if (typeof found == "undefined") {
		throw new Error("Opção inexistente");
	}

	return found;
}

const tamanho = ["padrao", "brotinho", "grande", "familia"];
const borda = ["tradicional", "sem borda", "recheada catupiry", "recheada cheddar"];
const sabor = ["mussarela", "calabresa", "frango", "portuguesa", "carne de sol"];
const extra = ["tomate", "pimentao", "cebola", "banana", "brocolis"];
const final = ["oregano", "pimenta calabresa", "pimenta do reino", "azeitona verde, azeitona preta"];

let builder = new Builder;

builder.setTamanho(checkInput("padrao", tamanho));
builder.setBorda(checkInput("tradicional", borda));
builder.setSabor(checkInput("mussarela", sabor));
builder.setExtra(checkInput("tomate", extra));
builder.setFinal(checkInput("oregano", final));
builder.getDetalhes();

const pizza1 = builder.getPizza();

builder.setTamanho(checkInput("grande", tamanho));
builder.setBorda(checkInput("sem borda", borda));
builder.setSabor(checkInput("frango", sabor));
builder.setExtra(checkInput("pimentao", extra));
builder.getDetalhes();

const pizza2 = builder.getPizza();

builder.setTamanho(checkInput("brotinho", tamanho));
builder.setBorda(checkInput("recheada catupiry", borda));
builder.setSabor(checkInput("portuguesa", sabor));
builder.setExtra(checkInput("banana", extra));
builder.setFinal(checkInput("pimenta do reino", final));
builder.getDetalhes();

const pizza3 = builder.getPizza();

process.exit(0);

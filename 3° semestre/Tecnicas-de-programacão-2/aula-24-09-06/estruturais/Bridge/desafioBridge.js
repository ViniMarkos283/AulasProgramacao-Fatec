/*
- desafio: adicionar mais 2 grupos: borda e opcionais extra
*/

// IMPLEMENTAÇÃO DAS TAMANHO ---------------------------------------:
// Interface das TAMANHO
class Tamanho {
    constructor(tamanho) {
        this.tamanho = tamanho;
    }

    getTamanho() {
        return this.tamanho;
    }
}

// interface de borda
class Borda {
    constructor(borda) {
        this.borda = borda;
    }

    getBorda() {
        return this.borda;
    }
}

// concreta de tipo de borda: catupiry, cheedar, requeijão
class BordaCatupiry extends Borda {
    constructor() {
        super("catupiry");
    }
}
class BordaCheedar extends Borda {
    constructor() {
        super("cheedar");
    }
}
class BordaRequeijao extends Borda {
    constructor() {
        super("requeijao");
    }
}

// extras
class Extra {
    constructor(extra) {
        this.extra = extra;
    }
    getExtra() {
        return this.extra;
    }
}

// variantes do extra:
class ExtraBacon extends Extra {
    constructor() {
        super("bacon")
    }
}
class ExtraMilho extends Extra {
    constructor() {
        super("milho")
    }
}
class ExtraCalabresa extends Extra {
    constructor() {
        super("calabresa")
    }
}

// Concreta dos Tamanhos:
class TamanhoBrotinho extends Tamanho {
    constructor() {
        super("brotinho");
    }
}

class TamanhoTradicional extends Tamanho {
    constructor() {
        super("tradicional");
    }
}

class TamanhoGrande extends Tamanho {
    constructor() {
        super("grande");
    }
}

// IMPLEMENTAÇÃO DAS SABORES ---------------------------------------:
// Interface de SABORES:
class Sabor {
    constructor(tamanho, borda, extra) {
        this.tamanho = tamanho;
        this.borda = borda;
        this.extra = extra;
    }

    setTamanho(tamanho) {
        this.tamanho = tamanho;
    }

    setBorda(borda) {
        this.borda = borda;
    }

    setExtra(extra) {
        this.extra = extra;
    }

    producaoPizza() {
        throw new Error("Este método precisa ser implementado pela subclasse");
    }
}

// Abstração refinada:
class Mussarela extends Sabor {
    producaoPizza() {
        console.log(`Produzindo Pizza de Mussarela ${this.tamanho.getTamanho(), this.borda.getBorda(), this.extra.getExtra()}.`);
    }
}

class Calabresa extends Sabor {
    producaoPizza() {
        console.log(`Produzindo Pizza de Calabresa ${this.tamanho.getTamanho(), this.borda.getBorda(), this.extra.getExtra()}.`);
    }
}

class Pepperoni extends Sabor {
    producaoPizza() {
        console.log(`Produzindo Pizza de Pepperoni ${this.tamanho.getTamanho(), this.borda.getBorda(), this.extra.getExtra()}.`);
    }
}

// Cliente--------------------------------------------------------:
const tamanhoBrotinho = new TamanhoBrotinho();
const tamanhoTradicional = new TamanhoTradicional();
const tamanhoGrande = new TamanhoGrande();

const bordaCatupiry = new BordaCatupiry();
const bordaCheedar = new BordaCheedar();
const bordaRequeijao = new BordaRequeijao();

const extraBacon = new ExtraBacon();
const extraCalabresa = new ExtraCalabresa();
const extraMilho = new ExtraMilho();

const pizza1 = new Mussarela(tamanhoGrande, bordaCatupiry, extraBacon);
const pizza2 = new Calabresa(tamanhoBrotinho, bordaRequeijao, extraMilho);
const pizza3 = new Pepperoni(tamanhoTradicional, bordaCheedar, extraCalabresa);

pizza1.producaoPizza();
pizza2.producaoPizza();
pizza3.producaoPizza();
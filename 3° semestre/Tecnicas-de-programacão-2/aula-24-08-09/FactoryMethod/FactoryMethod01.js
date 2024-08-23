// data 09/08/24

// começar fazendo cabeçalho [ainda n vamos fazer]

// classe base de veiculo
class Veiculo {
    constructor(modelo) {
        this.modelo = modelo;
    }

    mostrarDetalhes() {
        console.log(`modelo: ${this.modelo}`);
    }
}

// subclasses de veiculo
class Carro extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}

class Moto extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}

class Barco extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}


// fabrica abstrata de veiculos
class FabricaDeVeiculos {
    criarVeiculo(modelo) {
        throw new Error('O modelo criarVeiculo deve ser implementado pelas subclasses');
    }
}

// fabrica concreta de carros
class FabricaDeCarros extends FabricaDeVeiculos {
    criarVeiculo(modelo) {
        return new Carro(modelo);
    }
}
// fabrica concreta de motos
class FabricaDeMotos extends FabricaDeVeiculos {
    criarVeiculo(modelo) {
        return new Moto(modelo);
    }
}
// fabrica concreta de barcos
class FabricaDeBarcos extends FabricaDeVeiculos {
    criarVeiculo(modelo) {
        return new Barco(modelo);
    }
}

// --------------------------- uso do Factory Method ------------------------------
const fabricaDeCarros = new FabricaDeCarros();
const carro1 = fabricaDeCarros.criarVeiculo('Sedan');
const carro2 = fabricaDeCarros.criarVeiculo('Fusca');
carro1.mostrarDetalhes(); // saida: mostrar 'sedan'
carro2.mostrarDetalhes(); // saida: mostrar 'Fusca'

const fabricaDeMotos = new FabricaDeMotos();
const moto = fabricaDeMotos.criarVeiculo("Esportiva");
moto.mostrarDetalhes(); // saida: mostrar 'Esportiva'

const fabricaDeBarcos = new FabricaDeBarcos();
const barco = fabricaDeBarcos.criarVeiculo("Lancha");
moto.mostrarDetalhes(); // saida: mostrar 'lancha'

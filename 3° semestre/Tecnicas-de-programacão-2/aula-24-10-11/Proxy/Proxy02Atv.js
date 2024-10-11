// Objeto real
class Produto {
    constructor(nome, preco, codEAN) {
        this.nome = nome;
        this.preco = preco;
        this.codEAN = codEAN;
    }

    exibirDetalhes() {
        console.log(`
        Produto: ${this.nome}, 
        Preço: R$ ${this.preco.toFixed(2)}, 
        Código EAN: ${this.codEAN}\n`)
    }
}

class NotaFiscal{
    constructor(num, dataEM, horaEM, total, CnpjEmissor, nomeEmissor, cpfDest, nomeDest){
        this.num = num;
        this.dataEM = dataEM;
        this.horaEM = horaEM;
        this.total = total;
        this.CnpjEmissor = CnpjEmissor;
        this.nomeEmissor = nomeEmissor;
        this.cpfDest = cpfDest;
        this.nomeDest = nomeDest;
    }

    exibirDetalhes(){
        console.log(`Emissão de nota:
        numero da nota: ${this.num}
        nome do emissor: ${this.nomeEmissor},
        CNPJ do emissor: ${this.CnpjEmissor},
        nome do destinatario: ${this.nomeDest},
        CPF do destinatario: ${this.cpfDest},
        data e hora de emissão: ${this.dataEM + " " + this.horaEM}
        Valor total: ${this.total}`)
    }
}

class ProxyNotaFiscal{
    constructor(nota){
        this.nota = nota;
    }

    exibirDetalhes(){
        this.nota.exibirDetalhes();
    }  
}

// Proxy - ProxyProduto
class ProxyProduto {
    constructor(produto) {
        this.produto = produto;
    }

    exibirDetalhes() {
        console.log("Autenticando no sistema...")
        this.autenticar();
        // funcionalidade 1 - logando no sistema
        console.log("Autenticação realizada com sucesso...")
        this.produto.exibirDetalhes()

        console.log("Registrando no sistema...")
        // funcionalidade 2 - registrando em um sistema 2
        console.log("Operação concluida...\n")
    }

    autenticar() {
        console.log(">> Autenticando Usuario")
        console.log(">> Consultando dados...")
        console.log(">> Autenticação OK.")
    }
}

// uso do Proxy:
const produtoReal1 = new Produto("Camiseta", 39.90, "789500876542");
const produtoReal2 = new Produto("Boné", 49.90, "789500876375");
const ProxyProduto1 = new ProxyProduto(produtoReal1);
const ProxyProduto2 = new ProxyProduto(produtoReal2);

const notaFiscal = new NotaFiscal(500, '20/08/2023','12:20', 8000, '34534534500','Kleiton', '12312312344','junin');
const proxyNota = new ProxyNotaFiscal(notaFiscal);

ProxyProduto1.exibirDetalhes();
ProxyProduto2.exibirDetalhes();
proxyNota.exibirDetalhes();
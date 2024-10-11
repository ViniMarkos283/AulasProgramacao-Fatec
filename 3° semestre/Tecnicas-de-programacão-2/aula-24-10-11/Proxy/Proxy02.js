// Objeto real
class Produto {
    constructor(nome, preco, codEAN) {
        this.nome = nome;
        this.preco = preco;
        this.codEAN = codEAN;
    }

    exibirDetalhes() {
        console.log(`Produto: ${this.nome}
        Preço: R$ ${this.preco.toFixed(2)}
        Código EAN: ${this.codEAN}`)
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
        console.log("Autenticação realizada com sucesso...\n")
        this.produto.exibirDetalhes()

        console.log("Registrando no sistema...")
        // funcionalidade 2 - registrando em um sistema 2
        console.log("Operação concluida...\n")
    }

    autenticar(){
        console.log("Autenticando Usuario")
        console.log("Consultando dados...")
        console.log("Autenticação OK.")
    }
}

// uso do Proxy:
const produtoReal1 = new Produto("Camiseta", 39.90, "789500876542");
const produtoReal2 = new Produto("Boné", 49.90, "789500876375");
const ProxyProduto1 = new ProxyProduto(produtoReal1);
const ProxyProduto2 = new ProxyProduto(produtoReal2);

ProxyProduto1.exibirDetalhes();
ProxyProduto2.exibirDetalhes();
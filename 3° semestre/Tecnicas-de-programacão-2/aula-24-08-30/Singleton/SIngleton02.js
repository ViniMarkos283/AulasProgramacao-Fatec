// Projeto de um E-Commerce - carrinho de compra (sugestão: uso de backend para produtos)

// criação de um carrinho
const Carrinho = (function () { // instancia global, todos os objetos virão daqui
    let instance;

    function criaInstance() {
        let carrinho = []

        function addProduto(produto) {
            carrinho.push(produto);
        }

        function getCarrinho() {
            return carrinho;
        }

        function limparCarrinho() {
            carrinho = [];
        }

        return {
            addProduto,
            getCarrinho,
            limparCarrinho,
        }

    }
    return {
        getInstance: function () {
            if (!instance) {
                instance = criaInstance();
            }
            return instance;
        }
    };
})();

// Exemplo de Uso - Carrinho de compras de um e-commerce:
console.log("- - - Criação dos carrinhos - - -")
const carrinho1 = Carrinho.getInstance();
const carrinho2 = Carrinho.getInstance();

console.log("- - - Compara se o carrinho 1 = carrinho 2 - - -")
console.log(carrinho1 == carrinho2);

console.log("- - - adicionando produtos - - -")
carrinho1.addProduto({id:1, Produto: "produto A", preco: 10.00})
carrinho1.addProduto({id:2, Produto: "produto B", preco: 25.00})

console.log("- - - Mostra conteudo dos carrinhos - - -")
console.log(carrinho1.getCarrinho());
console.log(carrinho2.getCarrinho());

console.log("- - - Limpa o carrinho - - -")
carrinho1.limparCarrinho();

console.log("- - - após limpar o carrinho - - -")
console.log(carrinho1.getCarrinho());
console.log(carrinho2.getCarrinho());
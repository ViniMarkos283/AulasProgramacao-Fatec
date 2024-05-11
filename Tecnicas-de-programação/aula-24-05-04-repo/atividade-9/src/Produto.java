//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 76. Crie uma classe chamada Produto que represente um produto em um
// sistema de inventário. A classe deve ter campos para o nome do produto,
// o preço unitário e a quantidade em estoque. Crie métodos para calcular o
// valor total do estoque (preço unitário * quantidade) e para adicionar ou
// remover unidades do estoque. Escreva um programa principal que
// demonstre o uso dessa classe.
// Obs. A classe deverá ter:
// I. Construtor;
// II. Modificadores de acesso, conforme o padrão Java;
// III. Getters e Setters;
// IV. Classe principal.

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double valorTotal() {
        return preco * qtd;
    }

    public void adicionaUnidade(int val) {
        this.qtd += val;
    }

    public void removeUnidade(int val) {
        this.qtd -= val;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

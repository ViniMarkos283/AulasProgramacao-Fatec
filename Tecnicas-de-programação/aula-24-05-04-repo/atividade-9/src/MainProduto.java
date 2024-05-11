public class MainProduto {
    public static void main(String[] args) {
        Produto prod = new Produto("biscoito Trakinas", 2.50, 7);

        System.out.println("Valor inicial: " + prod.valorTotal());
        prod.adicionaUnidade(5);

        System.out.println("Valor pós adição: " + prod.valorTotal());
        prod.removeUnidade(2);

        System.out.println("Valor pós remoção: " + prod.valorTotal());
    }
}

public class NoArvore {
    int elemento, qtd; // adição de quantidade
    NoArvore esquerda, direita;

    public NoArvore(int e) {
        elemento = e;
        qtd = 1; // inicializa com 1
        esquerda = null;
        direita = null;
    }
}
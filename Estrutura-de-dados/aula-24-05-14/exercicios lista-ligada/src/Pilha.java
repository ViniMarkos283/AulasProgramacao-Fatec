public class Pilha { // LIFO
    private No topo;

    public Pilha() {
        topo = null; // pilha vazia
    }

    public void empilha(int e) {
        No novo = new No(e); // cria um novo nó
        novo.prox = topo; // garante q os dados não sejam perdidos, empurrando eles para o lado
        topo = novo; // o topo recebe o valor digitado no parametro
    }

    public boolean vazia() {
        return topo == null;
    }

    public int desempilha() throws Exception {
        if (vazia()) {
            throw new Exception("ERRO! Pilha vazia");
        } else {
            int r = topo.dado; // o valor q sai é recebido pela var local
            topo = topo.prox; // o topo recebe o valor do seu proximo
            return r; // retorna o valor desempilhado
        }
    }

    public String toString() {
        String r = ""; // string de retorno vazia
        No aux = topo; // nó auxiliar aponta para o topo
        while (aux != null) { // enqunto o auxiliar for diferente de null
            r = r + "\t" + aux.dado; // concatena os valores
            aux = aux.prox; // o auxiliar recebe o valor seguinte
        }
        return r;
    }
}

public class Pilha {
    private int dados[];
    private int topo;

    public Pilha(int capMax) {
        dados = new int[capMax]; // instanciando a lista dados dentro da mesma classe (preciso entender isso melhor)
        topo = -1; // qm vai controlar o tamanho
    }

    public void empilhar(int e) { // metodo empilhar
        if (!cheia()) { // se a pilha tiver o tamanho diferente do q os dados... | not method (nãocheia)
            dados[++topo] = e; // atribui o e ao dados e ao msm tempo já o incrementa (otimiza o tamanho das linhas)
        } else { // se os tamanhos forem iguais...
            System.out.println("Erro! pilha cheia!");
        }
    }

    public int desempilhar() {
        int r = -1;
        if (!vazio()) { // not method | traz o oposto do return do vazio, caso não esteja vazia...
            r = dados[topo--]; // mesmo esquema do empilhar, atribui o valor e decrementa ao msm tempo
        } else {
            System.out.println("Erro! pilha vazia!");
        }
        return r;
    }

    public String toString() { // mostra os valores da pilha
        String r = ""; // inicializa vazio
        for (int i = 0; i <= topo; i++) {
            r = dados[topo] + "\t" + r;
        }
        return r;
    }

    public boolean cheia() { // dará true se a pilha estiver cheia
        return topo == dados.length; // ele vai retornar um boolean caso a condição seja true ou false
    }

    public boolean vazio() { // dará true se estiver vazia
        return topo == -1;
    }

} // melhorar o codigo dps adicionando exceções [lição de casa] (vai cair na prova com exceções)
// fazer o fila (com o addfinal();)

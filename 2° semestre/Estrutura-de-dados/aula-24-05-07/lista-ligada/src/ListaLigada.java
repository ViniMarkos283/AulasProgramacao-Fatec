// aula do dia 07/05 e 13/05
public class ListaLigada { // cria-se um objeto Nó chamado inicio
    private No inicio;

    public ListaLigada() { // inicio começa nulo
        inicio = null;
    }

    public boolean vazia() { // quando nula, retorna true
        return inicio == null;
    }

    public void adicionaInicio(int e) { // adiciona no começo da lista
        No novo = new No(e); // instancia um nó chamado novo com o valor do parametro
        novo.prox = inicio; // o valor prox do novo recebe o valor do inicio
        inicio = novo; // agora o inicio recebe o valor do novo
    }

    public void adicionaFinal(int e) { // add valores no final da lista
        if (vazia()) { // se a lista estiver vazia...
            inicio = new No(e); // instancia um novo nó chamado inicio recebendo o valor do parametro
        } else { // senao...
            No novo = new No(e); // instancia um nó chamado novo recebendo o valor do parametro
            No aux = inicio; // o nó auxiliar recebe esse nó novo
            while (aux.prox != null) { // enquanto o aux.prox for diferente de null...
                aux = aux.prox; // aux recebe o aux.prox
            }
            aux.prox = novo; // no fim, o aux.prox recebe o nó novo
        }
    }

    public int removeFinal() throws Exception {
        if (vazia())
            throw new Exception("ERRO! Lista Vazia!");
        else {
            int r;
            if (inicio.prox == null) {
                r = inicio.dado;
                inicio = null;
            } else {
                No aux = inicio;
                while (aux.prox.prox != null) {
                    aux = aux.prox;
                }
                r = aux.prox.dado;
                aux.prox = null;
            }
            return r;
        }
    }

    public int removeInicio() throws Exception { // metodo com tratamento de exceções (erros)
        int r;
        if (vazia()) {
            throw new Exception("ERRO! Lista Vazia!"); // msg de erro q vai ser mostrada no main
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
    }

    public String toString() { // exibe valores dentro da lista
        No aux = inicio;
        String r = "";
        while (aux != null) {
            r = r + "\t" + aux.dado;
            aux = aux.prox;
        }
        return r;
    }
}

public class ListaLigada {
    private No inicio;

    public ListaLigada() {
        inicio = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void adicionaInicio(int e) {
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
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

    public String toString() {
        No aux = inicio;
        String r = "";
        while (aux != null) {
            r = r + aux.dado + "\t";
            aux = aux.prox;
        }
        return r;
    }

}
